package com.epam.lk.entity;

public class AuthorFactory {

    public static Author createAuthor() {

        Author author = new Author();

        author.setId(Publication.rnd.nextInt(1000));
        author.setName(RandomStringGetter.getString(RandomStringGetter.AUTHOR_NAME));
        author.setLastName(RandomStringGetter.getString(RandomStringGetter.AUTHOR_LASTNAME));

        return author;
    }
}
