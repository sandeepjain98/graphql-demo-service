package com.example.DemoGraphQL.controller;

import com.example.DemoGraphQL.model.Book;
import com.example.DemoGraphQL.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class BookController {
BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(path = "/books")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBooks()
         {
         return bookService.getAllBooks();
    }

    @GetMapping(path = "/books/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book getAllBooks(@PathVariable Long id)
    {
        return bookService.getBook(id);
    }

    @GetMapping(path = "/books/{id}/authors/{auid}")
    @ResponseStatus(HttpStatus.OK)
    public Book getAllBooks(@PathVariable Long id, @PathVariable Long auid)
    {
        return bookService.getBook(id);
    }
}
