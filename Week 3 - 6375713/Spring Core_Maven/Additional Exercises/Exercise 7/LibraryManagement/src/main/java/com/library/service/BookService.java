package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    
 // Constructor for DI
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    // Setter method for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performOperation() {
        System.out.println("BookService: Performing operation...");
        bookRepository.saveBook();
    }
}
