package com.example.demo.application.dao;

import com.example.demo.application.domain.Book;

import java.util.List;

public interface IBookDao {

    public List<Book> findByReader(String reader);


    public int addBook(Book book);
}
