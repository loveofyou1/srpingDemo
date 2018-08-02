package com.example.demo.application.mapper;

import com.example.demo.application.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sunlei19
 */
@Mapper
public interface BookMapper {

    /**
     * 查询书籍信息
     *
     * @param reader
     * @return
     */
    List<Book> findByReader(String reader);


    /**
     * 增加新书
     *
     * @param book
     * @return
     */
    public int addBook(Book book);
}
