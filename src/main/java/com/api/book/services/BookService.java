package com.api.book.services;

import com.api.book.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {
    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(13,"Python 2nd edition","Ahmad"));
        list.add(new Book(14,"JavaScript 1st edition","Mohsin"));
        list.add(new Book(15,"Ruby AND Rales 2nd edition","Ali"));
    }

    //get all books
    public List<Book> getAllBooks(){
        return list;
    }

    public Book getBookById(int id)
    {
        Book book = null;
        book = list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }
}
