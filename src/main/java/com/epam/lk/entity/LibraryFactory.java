package com.epam.lk.entity;

public class LibraryFactory {

    public static Library createLibrary() {

        int quantity=(int)(Math.random()*(10-2));

        Library publications = new Library();

        publications.setName("LIBRARY");

        publications.setId(Publication.rnd.nextInt(10));

        for (int i = 0; i < quantity; i++) {
            publications.addPublication(PublicationFactory.createPublication());
        }

        return publications;
    }

}
