package com.example.demo.application.web

import com.example.demo.application.domain.BookG
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("/")
class GroovyReaderListController {

    @RequestMapping(method =  RequestMethod.GET)
    def readerBooks(String author, Model model) {
        List<BookG> readinglist = BookG.findAllByAuthor(author)
        model.addAllAttributes("title", readinglist.title)
        
    }
}
