package com.flyway.services;

import com.flyway.models.BookAuthor;

import java.util.List;

public interface BookAuthorService {
    BookAuthor createBookAuthor(String bookId, String authorName);

    List<BookAuthor> getBookAuthorByBookId(String bookId);

    List<BookAuthor> getAllBooks();
}
