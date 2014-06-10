package com.epam.lk;

public class Book {
    private String title;
    private int id;

    private Library library;

    public Book(int id) {
        this.id = id;
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }
}
