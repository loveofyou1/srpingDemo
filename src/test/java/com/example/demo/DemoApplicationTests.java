package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.domain.Book;
import com.example.demo.service.IBookService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    public static final Logger logger = LogManager.getLogger(DemoApplicationTests.class);

    @Autowired
    private IBookService iBookService;


    @Test
    public void contextLoads() {
    }


    @Test
    public void testBookService() {
        List<Book> lists = iBookService.findByReader("1");
        logger.info("测试接口返回结果：{}", JSON.toJSONString(lists));
    }
}
