package com.tomek.dao;

import com.tomek.model.Book;

public interface BookDao {

    public void save(Book book);
    public Book get (Long id);
}