package com.example.demo.application.dao;

import com.example.demo.application.domain.Book;
import com.example.demo.application.mapper.BookMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sunlei19
 */
@ComponentScan("com.example.demo.application.mapper")
@Service
public class BookDaoImpl implements IBookDao {

    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Book> findByReader(String reader) {
        return bookMapper.findByReader(reader);
    }


    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }
}
