package com.epam.lk.entity;

import java.math.BigDecimal;

public class PublicationFactory {

    public static Publication createPublication(Type type) {

        switch (type) {

            case BOOK:
                Book book = new Book();
                book.setId(Publication.rnd.nextInt(100000));
                book.setTitle("...");
                book.setPrice(BigDecimal.valueOf(Publication.rnd.nextInt(50000)));
                book.setReprint(Publication.rnd.nextBoolean());
                book.setAuthor(AuthorFactory.createAuthor());
                book.setVolume(Publication.rnd.nextInt(5));
                return book;

            case JOURNAL:
                Journal journal = new Journal();
                return journal;

            case NEWSPAPER:
                Newspaper newspaper = new Newspaper();
                newspaper.setTitle("lol");
                newspaper.setId(1);
                newspaper.setEditionNum(6);

                return newspaper;

        }

        return null;
    }

    public enum Type {
        BOOK, JOURNAL, NEWSPAPER;

    }
}

