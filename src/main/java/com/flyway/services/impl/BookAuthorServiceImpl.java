package com.flyway.services.impl;

import com.flyway.models.Author;
import com.flyway.models.Book;
import com.flyway.models.BookAuthor;
import com.flyway.repos.BookAuthorRepository;
import com.flyway.services.AuthorService;
import com.flyway.services.BookAuthorService;
import com.flyway.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookAuthorServiceImpl implements BookAuthorService {
    private final BookAuthorRepository bookAuthorRepository;
    private final BookService bookService;
    private final AuthorService authorService;

    @Override
    public BookAuthor createBookAuthor(String bookId, String authorName) {
        Optional<Book> bookOP = bookService.getBookById(bookId);
        Book book = bookOP.orElseThrow(() -> new IllegalArgumentException("No Book Found"));
        Author author = authorService.getAuthorByName(authorName)
                .orElse(authorService.saveAuthor(authorName));

        BookAuthor bookAuthor = new BookAuthor(book, author);
        bookAuthorRepository.save(bookAuthor);
        return bookAuthor;
    }

    @Override
    public List<BookAuthor> getBookAuthorByBookId(String bookId) {
        return bookAuthorRepository.findBookAuthorByBook_id(bookId);
    }

    @Override
    public List<BookAuthor> getAllBooks() {
        return bookAuthorRepository.findAll();
    }
}
