package com.example.DemoGraphQL.resolver;

import com.example.DemoGraphQL.model.Author;
import com.example.DemoGraphQL.model.Book;
import com.example.DemoGraphQL.repository.AuthorRepository;
import com.example.DemoGraphQL.repository.BookArtistsRepository;
import com.example.DemoGraphQL.repository.BookRepository;
import com.example.DemoGraphQL.service.AuthorService;
import graphql.kickstart.tools.GraphQLQueryResolver;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    private BookArtistsRepository bookArtistsRepository;

    private AuthorService authorService;
    public Query(AuthorRepository authorRepository, BookRepository bookRepository
    ,BookArtistsRepository bookArtistsRepository
                 , AuthorService authorService) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.bookArtistsRepository=bookArtistsRepository;
        this.authorService=authorService;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAuthors();
    }

    public long countAuthors() {
        return authorRepository.count();
    }


    public List<Author> findAuthorByBookId(Long bookId ) {
        return authorService.getAuthorByBookId(bookId);
    }
}
