package ru.job4j.condition;

import java.sql.SQLOutput;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + " But I am newbie. ";
        int year = 2021;
        idea = idea + year;
        System.out.println(idea);
    }
}
