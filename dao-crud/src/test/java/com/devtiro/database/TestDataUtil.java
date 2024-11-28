package com.devtiro.database;

import com.devtiro.database.domain.Author;
import com.devtiro.database.domain.Book;

public final class TestDataUtil {
    private TestDataUtil() {
    }

    public static Author createTestAuthorA() {
        return Author.builder()
                .id(1L)
                .name("Aaron Thamin")
                .age(20)
                .build();
    }

    public static Author createTestAuthorB() {
        return Author.builder()
                .id(2L)
                .name("Cicilia Ardiana")
                .age(50)
                .build();
    }

    public static Author createTestAuthorC() {
        return Author.builder()
                .id(3L)
                .name("Felicia Halim")
                .age(25)
                .build();
    }

    public static Book createTestBookA() {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("Chemistry 101")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookB() {
        return Book.builder()
                .isbn("978-1-2345-6790-0")
                .title("JavaScript for Babies")
                .authorId(2L)
                .build();
    }

    public static Book createTestBookC() {
        return Book.builder()
                .isbn("978-1-2345-6791-0")
                .title("Mindset")
                .authorId(3L)
                .build();
    }
}
