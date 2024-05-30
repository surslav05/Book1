package com.example.book;

import java.util.UUID;

public class Book {
    public UUID getId() {
        return mId;
    }

    private UUID mId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;
    public Book() {
        mId = UUID.randomUUID(); //Генерирование уникального идентификатора
    }
}
