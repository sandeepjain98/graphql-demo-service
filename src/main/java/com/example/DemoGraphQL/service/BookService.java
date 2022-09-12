package com.example.DemoGraphQL.service;

import com.example.DemoGraphQL.model.Book;
import com.example.DemoGraphQL.repository.BookRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    BookRepository bookRepository;
    BookService(BookRepository bookRepository)
    {
        this.bookRepository=bookRepository;
    }

   public  List<Book> getAllBooks()
    {
       return bookRepository.findAll();
    }

    public Book getBook(Long id) {
        return bookRepository.findById(id).orElseGet(null);
    }
}
