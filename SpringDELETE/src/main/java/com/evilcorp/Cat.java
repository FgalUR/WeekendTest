package com.evilcorp;

public class Cat implements Animals {
    private String name = "BOB";

    @Override
    public void saySmt() {
        System.out.println("Hi i am Cat");
    }

    @Override
    public String getName() {
        return name;
    }
}
