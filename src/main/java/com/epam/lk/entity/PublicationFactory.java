package com.epam.lk.entity;

import com.epam.lk.entity.Publication;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PublicationFactory {



public enum Type{
       BOOK,JOURNAL,NEWSPAPER

    }
    // TODO: createRandomizedBook
    public static Publication createPublication( Type type,String title, int id, Date publicationDate, List<Author> author, BigDecimal price) {
       switch (type){
           case BOOK :
               Publication publication = new Book();
               case JOURNAL:
                   Publication publication1 = new Journal();
                   case  NEWSPAPER:
                       Publication publication2 = new Newspaper();
       }

        Publication publication = new Publication(title,id,publicationDate,author,price);
        return  publication;


    }
}

