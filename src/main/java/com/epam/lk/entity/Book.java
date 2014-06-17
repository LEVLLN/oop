package com.epam.lk.entity;

public class Book extends Publication {
    private int volume;
    private boolean reprint;

    @Override
    public String toString() {
        return "Book{" +
                "volume=" + volume +
                ", reprint=" + reprint +
                '}';
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
