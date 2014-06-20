package com.epam.lk.entity;

public class Newspaper extends Publication {

    private int editionNum;
    private String header;

    @Override
    public String toString() {
        return "Newspaper{" +
                "editionNum=" + editionNum +
                ", header='" + header + '\'' +
                " " + super.toString();
    }

    public int getEditionNum() {
        return editionNum;
    }

    public void setEditionNum(int editionNum) {
        this.editionNum = editionNum;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
