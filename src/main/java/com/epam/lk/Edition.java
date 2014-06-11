package com.epam.lk;


import java.sql.Date;

public abstract class Edition {
    private String title;
    private int id;
    private Date dateOfPublucation;
    private double price;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateOfPublucation() {
        return dateOfPublucation;
    }

    public void setDateOfPublucation(Date dateOfPublucation) {
        this.dateOfPublucation = dateOfPublucation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}