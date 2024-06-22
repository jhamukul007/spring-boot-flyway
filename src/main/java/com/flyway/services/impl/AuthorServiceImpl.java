package com.flyway.services.impl;

import com.flyway.models.Author;
import com.flyway.repos.AuthorRepository;
import com.flyway.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Optional<Author> getAuthorByName(String name) {
        return authorRepository.findAuthorByName(name);
    }

    @Override
    public Author saveAuthor(String authorName) {
        Author author = new Author(authorName);
        authorRepository.save(author);
        return author;
    }
}
