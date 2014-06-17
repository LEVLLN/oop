package com.epam.lk.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {

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
                "id=" + id +
                ", publications=" + publications +
                ", name='" + name + '\'' +
                '}';
    }

//  Setter and Getter

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


}

