package com.devtiro.database;

import com.devtiro.database.domain.entities.AuthorEntity;
import com.devtiro.database.domain.entities.BookEntity;

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

    public static BookEntity createTestBookA(AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-0")
                .title("Chemistry 101")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookEntity createTestBookB(AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6790-0")
                .title("JavaScript for Babies")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookEntity createTestBookC(AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6791-0")
                .title("Mindset")
                .authorEntity(authorEntity)
                .build();
    }
}
