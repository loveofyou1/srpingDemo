package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 提供link{SpringBootServletInitializer}类用来配置spring的DispatcherServlet
 * Servlet,SpringBootServletInitializer还会在spring应用程序上下文里查找Filter,Servlet或
 * ServletContextInitializer类型的bean,把他们绑定到servlet容器里.
 * 只需要创建一个子类,覆盖configure方法来指定spring配置类
 *
 * @author sunlei19
 * @create 2018/8/2
 */
public class ReadingListServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoApplication.class);
    }
}
