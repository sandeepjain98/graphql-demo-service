package com.example.DemoGraphQL.model;

import javax.persistence.*;

@Entity
public class BookArtist {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        Long id;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }



        public int getRating() {
                return rating;
        }

        public void setRating(int rating) {
                this.rating = rating;
        }

        @Column(name="book_id", nullable = false)
        Long bookId;

        @Column(name="artists_id", nullable = false)
        Long artistsId;

        public Long getBookId() {
                return bookId;
        }

        public void setBookId(Long bookId) {
                this.bookId = bookId;
        }

        public Long getArtistsId() {
                return artistsId;
        }

        public void setArtistsId(Long artistsId) {
                this.artistsId = artistsId;
        }

        int rating;

        // standard constructors, getters, and setters
    }

