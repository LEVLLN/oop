package com.epam.lk;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    protected String name;

    public Library(){
        this.books = new ArrayList<Book>();
    }

    public Library(String name) {
        this.books = new ArrayList<Book>();
        this.name = name;
    }

    public void addBook(Book book){

    }

    public void sortByName(Book book){

    }
}

