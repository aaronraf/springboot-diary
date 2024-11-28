package com.devtiro.database.dao;

import com.devtiro.database.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {
    void create(Book book);

    Optional<Book> find(String isbn);

    List<Book> find();
}
