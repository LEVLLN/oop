package com.epam.lk.entity;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publication {

    private String title;
    private int id;
    private Date publicationDate;
    private BigDecimal price;
    private List<Author> author;
    public Publication(){ this.author = new ArrayList<Author>();}

    protected Publication(String title, int id, Date publicationDate, List<Author> author, BigDecimal price) {
        this.title = title;
        this.id = id;
        this.publicationDate = publicationDate;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", publicationDate=" + publicationDate +
                ", price=" + price +
                ", author=" + author +
                '}';
    }


// Setter and getter


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

    //todo: bigdecimal working
    public void setPrice(BigDecimal price) {
        this.price=price;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor() {
        this.author = author;
    }
}