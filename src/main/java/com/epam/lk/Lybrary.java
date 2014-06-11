package com.epam.lk;

import java.util.ArrayList;
import java.util.List;

public abstract class Lybrary {
    private List<Edition> editions;
    private String name;

    public Lybrary(){
        this.editions = new ArrayList<Edition>();
    }

    public Lybrary(String name) {
        this.editions = new ArrayList<Edition>();
        this.name = name;
    }


    public  void addEdition(Edition edition){
    editions.add(edition);
    }

    public void clearEdition(Edition edition){
    editions.clear();
    }
    public void sortByTitle(Edition edition){

    }


}

