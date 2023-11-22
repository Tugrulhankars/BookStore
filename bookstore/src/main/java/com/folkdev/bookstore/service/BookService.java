package com.folkdev.bookstore.service;

import com.folkdev.bookstore.model.Book;
import com.folkdev.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
//spring boot uygulama ayağa kalkarken servisleri tarıyor ve ctor çalıştırıyor ctor'u çalıştırması için
    //bookRepository objesine ihtiyacı var bu nedenle ilk önce bookRepository objesini oluşturup bookservice parametreyi geçiyor
    // bu parametre singlaten
    //Transactional
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book>  findBookById(Integer bookId){
        return bookRepository.findById(bookId);
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
