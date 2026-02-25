package com.bookstore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    // Find book by title
    Optional<Book> findByTitle(String title);
    
    // Find books by author
    List<Book> findByAuthor(String author);
    
    // Find books by ISBN
    Optional<Book> findByIsbn(String isbn);
    
    // Find books with price greater than specified amount
    List<Book> findByPriceGreaterThan(Double price);
    
}