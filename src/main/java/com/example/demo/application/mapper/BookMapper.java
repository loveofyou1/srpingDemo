package com.example.demo.application.mapper;

import com.example.demo.application.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    List<Book> findByReader(String reader);

    public int addBook(Book book);
}
