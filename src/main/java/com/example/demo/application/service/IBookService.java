package com.example.demo.application.service;

import com.example.demo.application.domain.Book;

import java.util.List;

public interface IBookService {
    public List<Book> findByReader(String reader);


    public int addBook(Book book);
}
