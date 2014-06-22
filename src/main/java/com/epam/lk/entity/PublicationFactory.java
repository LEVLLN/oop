package com.epam.lk.entity;

import java.math.BigDecimal;

public class PublicationFactory {

    public static Type getRandom() {
        return Type.values()[Publication.rnd.nextInt(Type.values().length)];
    }

    public static Publication createPublication() {

        switch (getRandom()) {

            case BOOK:
                Book book = new Book();
                book.setId(Publication.rnd.nextInt(100000));
                book.setTitle(RandomStringGetter.getString(RandomStringGetter.TITLE));
                book.setPrice(BigDecimal.valueOf(Publication.rnd.nextInt(10000)));
                book.setReprint(Publication.rnd.nextBoolean());
                book.setAuthor(AuthorFactory.createAuthor());
                book.setVolume(Publication.rnd.nextInt(5));

                return book;

            case JOURNAL:
                Journal journal = new Journal();
                journal.setTitle(RandomStringGetter.getString(RandomStringGetter.TITLE));
                journal.setId(Publication.rnd.nextInt(1000));
                journal.setEditionNum(Publication.rnd.nextInt(10000));
                journal.setHeader(RandomStringGetter.getString(RandomStringGetter.JOURNAL_HEADER));
                journal.setPrice(BigDecimal.valueOf(Publication.rnd.nextInt(1500)));
                journal.setAuthor(AuthorFactory.createAuthor());

                return journal;

            case NEWSPAPER:
                Newspaper newspaper = new Newspaper();
                newspaper.setTitle(RandomStringGetter.getString(RandomStringGetter.TITLE));
                newspaper.setId(Publication.rnd.nextInt(1000));
                newspaper.setEditionNum(Publication.rnd.nextInt(10000));
                newspaper.setHeader(RandomStringGetter.getString(RandomStringGetter.NEWSPAPER_HEADER));
                newspaper.setPrice(BigDecimal.valueOf(Publication.rnd.nextInt(500)));
                newspaper.setAuthor(AuthorFactory.createAuthor());

                return newspaper;

        }

        return null;
    }

    public enum Type {BOOK, JOURNAL, NEWSPAPER;}

}

