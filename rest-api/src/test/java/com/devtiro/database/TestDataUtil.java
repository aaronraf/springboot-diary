package com.devtiro.database;

import com.devtiro.database.domain.dto.AuthorDto;
import com.devtiro.database.domain.dto.BookDto;
import com.devtiro.database.domain.entities.AuthorEntity;
import com.devtiro.database.domain.entities.BookEntity;

import java.awt.print.Book;

public final class TestDataUtil {
    private TestDataUtil() {
    }

    public static AuthorEntity createTestAuthorA() {
        return AuthorEntity.builder()
                .id(1L)
                .name("Aaron Thamin")
                .age(20)
                .build();
    }

    public static AuthorEntity createTestAuthorB() {
        return AuthorEntity.builder()
                .id(2L)
                .name("Cicilia Ardiana")
                .age(50)
                .build();
    }

    public static AuthorEntity createTestAuthorC() {
        return AuthorEntity.builder()
                .id(3L)
                .name("Felicia Halim")
                .age(25)
                .build();
    }

    public static BookEntity createTestBookEntityA(final AuthorEntity author) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-0")
                .title("Chemistry 101")
                .author(author)
                .build();
    }

    public static BookDto createTestBookDtoA(final AuthorDto author) {
        return BookDto.builder()
                .isbn("978-1-2345-6789-0")
                .title("Chemistry 101")
                .author(author)
                .build();
    }

    public static BookEntity createTestBookEntityB(AuthorEntity author) {
        return BookEntity.builder()
                .isbn("978-1-2345-6790-0")
                .title("JavaScript for Babies")
                .author(author)
                .build();
    }

    public static BookEntity createTestBookEntityC(AuthorEntity author) {
        return BookEntity.builder()
                .isbn("978-1-2345-6791-0")
                .title("Mindset")
                .author(author)
                .build();
    }
}
