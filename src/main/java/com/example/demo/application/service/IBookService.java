package com.example.demo.application.service;

import com.example.demo.application.domain.Book;

import java.util.List;

/**
 * @author sunlei19
 */
public interface IBookService {

    /**
     * 查询书籍
     *
     * @param reader
     * @return
     */
    public List<Book> findByReader(String reader);


    /**
     * 增加新书
     *
     * @param book
     * @return
     */
    public int addBook(Book book);
}
