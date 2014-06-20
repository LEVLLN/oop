package com.epam.lk.entity;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

public abstract class Publication {

    public static Random rnd = new Random();
    private String title;
    private int id;
    private Date publicationDate;
    private BigDecimal price;
    private Author author;


    public Publication() {
        this.author = new Author();
    }

    protected Publication(String title, int id, Date publicationDate, Author author, BigDecimal price) {
        this.title = title;
        this.id = id;
        this.publicationDate = publicationDate;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return " " +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", publicationDate=" + publicationDate +
                ", price=" + price +
                ", author" + author +
                '}';
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }


    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}