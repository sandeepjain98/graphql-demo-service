package com.example.DemoGraphQL.service;

import com.example.DemoGraphQL.repository.BookArtistsRepository;
import org.springframework.stereotype.Service;

@Service
public class BookArtisitsService {

    BookArtistsRepository bookArtistsRepository;

    public BookArtisitsService(BookArtistsRepository bookArtistsRepository) {
        this.bookArtistsRepository = bookArtistsRepository;
    }
}
