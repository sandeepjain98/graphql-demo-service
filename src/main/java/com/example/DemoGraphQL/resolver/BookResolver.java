package com.example.DemoGraphQL.resolver;

import com.example.DemoGraphQL.model.Author;
import com.example.DemoGraphQL.model.Book;
import com.example.DemoGraphQL.model.BookArtist;
import com.example.DemoGraphQL.repository.AuthorRepository;
import com.example.DemoGraphQL.repository.BookArtistsRepository;
import com.example.DemoGraphQL.service.AuthorService;
import graphql.kickstart.tools.GraphQLResolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookResolver implements GraphQLResolver<Book> {
    private BookArtistsRepository bookArtistsRepository;

    private AuthorService authorService;


    public BookResolver(BookArtistsRepository bookArtistsRepository,
                        AuthorService authorService) {
        this.bookArtistsRepository = bookArtistsRepository;
        this.authorService=authorService;
    }
    public List<Author> getAuthorList(Book book) {
        return authorService.getAuthorByBookId(book.getId());
    }
}
