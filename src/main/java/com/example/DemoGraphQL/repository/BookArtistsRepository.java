package com.example.DemoGraphQL.repository;

import com.example.DemoGraphQL.model.Author;
import com.example.DemoGraphQL.model.BookArtist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface BookArtistsRepository extends JpaRepository<BookArtist, Long> {

    @Query(
            value = "SELECT * FROM BOOK_ARTIST BOOK_ARTIST where BOOK_ARTIST.BOOK_ID = :bookId" ,
            nativeQuery = true)
    List<BookArtist> findAuthorIdByBookId(
     @Param("bookId") Long bookId);
}
