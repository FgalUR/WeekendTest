package com.evilcorp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        House house=context.getBean("houseWithSetter", House.class);
        house.wantToSay();
    }
}