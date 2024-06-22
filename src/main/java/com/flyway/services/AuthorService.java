package com.flyway.services;

import com.flyway.models.Author;

import java.util.Optional;

public interface AuthorService {
    Optional<Author> getAuthorByName(String name);
    Author saveAuthor(String authorName);

}
