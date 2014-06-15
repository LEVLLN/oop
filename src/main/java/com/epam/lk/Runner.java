package com.epam.lk;


import com.epam.lk.Factory.PublicationFactory;
import com.epam.lk.entity.Library;
import com.epam.lk.entity.Publication;

public class Runner {
    public static void main(String[] args) {
       Publication publication =  PublicationFactory.createRandomized();
    }
}
