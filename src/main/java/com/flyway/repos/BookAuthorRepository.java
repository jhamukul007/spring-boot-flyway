package com.flyway.repos;

import com.flyway.models.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookAuthorRepository extends JpaRepository<BookAuthor, String> {
    List<BookAuthor> findBookAuthorByBook_id(String bookId);
}
