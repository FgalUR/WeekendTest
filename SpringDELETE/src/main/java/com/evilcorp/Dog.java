package com.evilcorp;

public class Dog implements Animals {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void saySmt() {
        System.out.println("I am Dog");
    }

    @Override
    public String getName() {
        return name;
    }
}
