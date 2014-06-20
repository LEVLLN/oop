package com.epam.lk.entity;

public class Author {
    private int id;
    private String name;
    private String secondName;

    public Author(int id, String name, String secondName) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
    }

    public Author() {

    }


    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
