package com.example.demo.domain;


import lombok.Data;

/**
 * @author sunlei19
 */
@Data
public class Book {

    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
