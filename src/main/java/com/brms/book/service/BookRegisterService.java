package com.brms.book.service;


import org.springframework.beans.factory.annotation.Autowired;
import com.brms.book.Book;

public class BookRegisterService {

    @Autowired
    private BookDao bookDao;


    public BookRegisterService(){

    }

    public void register(Book book){
        bookDao.insert(book);
    }
}
