package com.epam.lk.entity;

public class AuthorFactory {

    public static Author createAuthor() {

        Author author = new Author();

        author.setId(Publication.rnd.nextInt(1000));
        author.setName("...");
        author.setSecondName("...");


        return author;
    }
}
