package com.epam.lk.entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Publication {
    private String title;
    private int id;
    private Date publicationDate;
    private double price;
    private List<Author> author;
    public Publication(){ this.author = new ArrayList<Author>();}



}