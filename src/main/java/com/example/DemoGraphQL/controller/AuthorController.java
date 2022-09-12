package com.example.DemoGraphQL.controller;

import com.example.DemoGraphQL.model.Book;
import com.example.DemoGraphQL.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
BookService bookService;
    public AuthorController(BookService bookService) {
        this.bookService = bookService;
    }


}
