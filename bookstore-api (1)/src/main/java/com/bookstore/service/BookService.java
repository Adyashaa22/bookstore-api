package com.bookstore.service;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(String title, String author, String category, Double rating) {
        if (title != null) return bookRepository.findByTitleContainingIgnoreCase(title);
        if (author != null) return bookRepository.findByAuthor(author);
        if (category != null) return bookRepository.findByCategory(category);
        if (rating != null) return bookRepository.findByRatingGreaterThanEqual(rating);
        return bookRepository.findAll();
    }

    public Book getBook(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public Book updateBook(Long id, Book book) {
        book.setId(id);
        return bookRepository.save(book);
    }
}
