package com.epam.lk;


import com.epam.lk.entity.Author;
import com.epam.lk.entity.Newspaper;
import com.epam.lk.entity.PublicationFactory;
import com.epam.lk.entity.Publication;
import sun.text.resources.cldr.ja.FormatData_ja;

import java.awt.print.Book;
import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {

   Publication publication;

      publication = PublicationFactory.createPublication(PublicationFactory.Type.NEWSPAPER);


        System.out.println(publication);





    }



}
