package com.evilcorp;

import java.sql.SQLOutput;

public class House  {
    private  Animals animals;

    public House() {
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }

//    public House(Animals animals) {
//        this.animals = animals;
//    }
    public void wantToSay(){
        System.out.println("Hello it is "+ animals.getName());
        animals.saySmt();
    }
}
