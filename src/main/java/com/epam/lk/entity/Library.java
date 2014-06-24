package com.epam.lk.entity;

import org.apache.log4j.Logger;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Library {

    private static final Logger LOGGER = org.apache.log4j.Logger.getLogger(Library.class);

    private int id;
    private List<Publication> publications;
    private String name;

    public Library() {
        this.publications = new ArrayList<Publication>();
    }

    public Library(String name) {
        this.publications = new ArrayList<Publication>();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id + ", name='" + name + '\'' +
                ", publications=" + publications +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    public void sortByTitle() {
        Collections.sort(publications, Publication.titleComparator);
        LOGGER.info("\n" + "Sorting by title: \n" + publications + "\n");
    }

    public void sortById() {
        Collections.sort(publications, Publication.idComparator);
        LOGGER.info("\n" + "Sorting by ID: \n" + publications + "\n");
    }

    private List<Publication> getFilteredList(SearchFilter f) {
        List<Publication> result = new ArrayList<Publication>();
        for (Publication publication : publications) {
            if (f.filter(publication))
                result.add(publication);
        }
        return result;
    }

    public List<Publication> filterByTitle(String title) {
        if (null == title) throw new InvalidParameterException("Title cannot be null");
        List<Publication> result;
        result = getFilteredList(p -> p.getTitle() == title);
        LOGGER.info("Publications with title:" +title + ") quantities:" + result.size()  + " request: \n" + result.toString());
        return result;
    }


}

