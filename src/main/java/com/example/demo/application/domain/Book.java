package com.example.demo.application.domain;


import lombok.Data;

@Data
public class Book {

    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
