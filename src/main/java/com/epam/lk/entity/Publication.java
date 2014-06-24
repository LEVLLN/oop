package com.epam.lk.entity;


import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public abstract class Publication implements Comparable<Publication>, Cloneable {

    public static Random rnd = new Random();
    public static Comparator<Publication> titleComparator = new Comparator<Publication>() {
        @Override
        public int compare(Publication t1, Publication t2) {
            String titleOne = t1.getTitle();
            String titleTwo = t2.getTitle();
            return titleOne.compareTo(titleTwo);
        }
    };

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Publication)super.clone();
    }

    public static Comparator<Publication> idComparator = new Comparator<Publication>() {
        @Override
        public int compare(Publication i1, Publication i2) {
            Integer id1 = i1.getId();
            Integer id2 = i2.getId();
            return id1.compareTo(id2);

        }
    };
    private String title;
    private int id;
    private BigDecimal price;
    private Author author;

    public Publication() {
        this.author = new Author();
    }

    protected Publication(String title, int id, Author author, BigDecimal price) {
        this.title = title;
        this.id = id;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", id=" + id +
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


}