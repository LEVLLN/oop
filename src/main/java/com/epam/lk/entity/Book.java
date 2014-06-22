package com.epam.lk.entity;

public class Book extends Publication {

    private int volume;
    private boolean reprint;

    public Book(int volume, boolean reprint) {
        this.volume = volume;
        this.reprint = reprint;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "\n" + "Book{" + super.toString() +
                "volume=" + volume +
                ", reprint=" + reprint;

    }

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

    @Override
    public int compareTo(Publication o) {
        return 0;
    }
}
