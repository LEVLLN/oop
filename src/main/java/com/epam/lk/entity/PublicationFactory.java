package com.epam.lk.entity;

import com.epam.lk.entity.Publication;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PublicationFactory {

    public PublicationFactory() {
    }

    // TODO: createRandomizedBook

    public static Publication createPublication(String title, int id, Date publicationDate, List<Author> author, BigDecimal price) {
        Publication publication = new Publication(title,id,publicationDate,author,price);
        return  publication;

    }
}

