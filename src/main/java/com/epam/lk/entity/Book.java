package com.epam.lk.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Book extends Publication {
    private int volume;
    private boolean reprint;

    public Book() {
        this.volume = volume;
        this.reprint = reprint;
    }

    @Override
    public String toString() {
        return "Book{" +
                "volume=" + volume +
                ", reprint=" + reprint +
                "} " + super.toString();
    }

// Setter and getter


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isReprint() {
        return reprint;
    }

    public void setReprint(boolean reprint) {
        this.reprint = reprint;
    }

}
