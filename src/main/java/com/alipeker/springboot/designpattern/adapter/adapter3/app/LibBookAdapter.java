package com.alipeker.springboot.designpattern.adapter.adapter3.app;

import com.alipeker.springboot.designpattern.adapter.adapter3.lib1.Book;
import com.alipeker.springboot.designpattern.adapter.adapter3.lib2.LibBook;

public class LibBookAdapter implements LibBook {

    private Book book;

    public LibBookAdapter(Book book) {
        this.book = book;
    }

    @Override
    public Integer getId() {

        Long bookId = book.getBookId();

        return bookId.intValue();
    }

    @Override
    public String getAuthor() {
        return book.getAuthor();
    }

    @Override
    public String getName() {
        return book.getName();
    }
}
