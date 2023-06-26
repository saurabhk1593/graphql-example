package com.baraq.reports.query;

import com.baraq.reports.entity.Book;
import com.baraq.reports.repository.BookRepository;
import com.baraq.reports.response.BookReponse;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    BookRepository bookRepository;

    public List<Book> books(){
        List<Book> books = bookRepository.findAll();
        return books;
    }
    public BookReponse getBookById(Long id){
        Book book = bookRepository.findById(id).get();
        BookReponse response = new BookReponse(book.getId(),book.getTitle(), book.getAuthor());
        return response;
    }
}
