package com.epam.lk;


import com.epam.lk.entity.*;
import org.apache.log4j.Logger;

import java.util.TreeSet;


public class Runner {

    private static Logger LOGGER = Logger.getLogger(Runner.class);

    public static void main(String[] args) {

    Library  publications = new Library();

    publications = LibraryFactory.createLibrary();

    LOGGER.info(publications+"\n");

    publications.sortByTitle();
    LOGGER.info("\n"+"Sorting by title: \n"+publications+"\n");

    publications.sortById();
    LOGGER.info("\n"+"Sorting by ID: \n"+publications+"\n");

    }



}
