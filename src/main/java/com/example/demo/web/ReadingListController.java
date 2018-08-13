package com.example.demo.web;

import com.alibaba.fastjson.JSON;
import com.example.demo.domain.Book;
import com.example.demo.service.IBookService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunlei19
 */
@RestController
public class ReadingListController {

    private static final Logger logger = LogManager.getLogger(ReadingListController.class);

    @Autowired
    private IBookService iBookService;


    @RequestMapping(value = "/reader", method = {RequestMethod.GET})
    public String readersBooks(String reader) {
        List<Book> books = new ArrayList<>();
        String result = null;
        try {
            books = iBookService.findByReader(reader);
            result = JSON.toJSONString(books);
        } catch (Exception e) {
            logger.error("查询书籍目录出错：{}", JSON.toJSONString(books));
        }
        return result;
    }


    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public String addBook(String title) {
        Book book = new Book();
        book.setIsbn("isbn");
        book.setAuthor("sun");
        book.setReader("dean");
        book.setTitle(title);
        book.setDescription("test title!");
        int result = iBookService.addBook(book);
        return String.valueOf(result);
    }
}
