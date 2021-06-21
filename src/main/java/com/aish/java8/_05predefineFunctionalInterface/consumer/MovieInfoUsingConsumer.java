package com.aish.java8._05predefineFunctionalInterface.consumer;


import java.util.ArrayList;
import java.util.function.Consumer;

class Movie {
    String name;
    String hero;
    String heroine;

    Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }
}

public class MovieInfoUsingConsumer {

    public static void main(String[] args) {

        // ArrayList obj to store movie info
        ArrayList<Movie> l = new ArrayList<Movie>();

        // Call populate method to store movies in arraylist obj
        populate(l);

        // Lambda expression with consumer
        Consumer<Movie> c = m -> {
            System.out.println("Movie Name:" + m.name);
            System.out.println("Movie Hero:" + m.hero);
            System.out.println("Movie Heroine:" + m.heroine);
            System.out.println();
        };

        // To display each movie method using foreach call to consumer accept() method
        for (Movie m : l) {
            c.accept(m);
        }
    }

    public static void populate(ArrayList<Movie> l) {
        l.add(new Movie("Bahubali", "Prabhas", "Anushka"));
        l.add(new Movie("Rayees", "Sharukh", "Sunny"));
        l.add(new Movie("Dangal", "Ameer", "Ritu"));
        l.add(new Movie("Sultan", "Salman", "Anushka"));
    }
}

/**
 * Output
 *
 * Movie Name:Bahubali
 * Movie Hero:Prabhas
 * Movie Heroine:Anushka
 *
 * Movie Name:Rayees
 * Movie Hero:Sharukh
 * Movie Heroine:Sunny
 *
 * Movie Name:Dangal
 * Movie Hero:Ameer
 * Movie Heroine:Ritu
 *
 * Movie Name:Sultan
 * Movie Hero:Salman
 * Movie Heroine:Anushka
 */