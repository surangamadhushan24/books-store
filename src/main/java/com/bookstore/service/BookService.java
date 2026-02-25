package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.Book;

public interface BookService {


    Book createBook(Book book);
    Book getBookById(Long id);
    List<Book> getAllBooks();
    Book updateBook(Book book);
    void deleteBook(Long id);

    
}