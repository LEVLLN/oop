package com.epam.lk;


import com.epam.lk.entity.Author;
import com.epam.lk.entity.AuthorFactory;
import com.epam.lk.entity.Publication;
import com.epam.lk.entity.PublicationFactory;
import org.apache.log4j.Logger;


public class Runner {

    private static Logger LOGGER = Logger.getLogger(Runner.class);

    public static void main(String[] args) {


        Publication publication;
        Author author;

            author = AuthorFactory.createAuthor();

            publication = PublicationFactory.createPublication(PublicationFactory.Type.BOOK);

            LOGGER.info("Info about new publication: "+"\n"+publication);
    }


}
