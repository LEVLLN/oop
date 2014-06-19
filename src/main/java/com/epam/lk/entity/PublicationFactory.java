package com.epam.lk.entity;

import com.epam.lk.entity.Publication;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PublicationFactory {
    public PublicationFactory() {
    }

    // TODO: createRandomizedBook
    public static Publication createPublication(Type type) {
        switch (type) {
            case BOOK:
                Publication book = new Book();
                book.setId(54);
                book.setTitle("...");
                return book;
            case JOURNAL:
                Publication journal = new Journal();
                return journal;
            case NEWSPAPER:
                Publication newspaper = new Newspaper();
                newspaper.setTitle("JUJU");
                newspaper.setId(1);

                return newspaper;

        }

        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public enum Type {
        BOOK, JOURNAL, NEWSPAPER;

        Type() {
        }
    }
}

