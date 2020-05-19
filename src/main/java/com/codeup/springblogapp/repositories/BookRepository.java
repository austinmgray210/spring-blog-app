package com.codeup.springblogapp.repositories;

import com.codeup.springblogapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByPubYear(int year);
    long deleteByAuthor(String author);

}
