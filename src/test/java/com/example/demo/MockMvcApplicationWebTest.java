package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author sunlei19
 * @create 2018/7/30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@WebAppConfiguration
public class MockMvcApplicationWebTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;


    @Before
    public void setUpMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void reader() throws Exception {
        /*mockMvc.perform(get("/reader")).andExpect(status().isOk()).andExpect(view().name("reader"))
                .andExpect(model().attributeExists("books"))
                .andExpect(model().attribute("books", is(empty())));*/
        mockMvc.perform(get("/reader").param("reader","1"));
    }
}
