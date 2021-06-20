package com.aish.java8.predefineFunctionalInterface.consumer;

import java.util.function.Consumer;

/*
 * Consumer chaining
 * c1.andThen(c2).andThen(c3).accept(s)
 * First Consumer c1 will be applied followed by c2 and c3.
 */

/**
 * Movies class
 *
 * @author Aishwarya Jorve
 */
class Movies {
    String name;
    String result;

    Movies(String name, String result) {
        this.name = name;
        this.result = result;
    }
}

public class ConsumerChainingDemo {

    public static void main(String[] args) {

        // First consumer to show notification of movie
        Consumer<Movies> c1 = m -> System.out.println("Movie:" + m.name + " is ready to release");

        // Second consumer to show result of movie
        Consumer<Movies> c2 = m -> System.out.println("Movie:" + m.name + " is just Released and it is:" + m.result);

        // Third to store movie in database
        Consumer<Movies> c3 = m -> System.out.println("Movie:" + m.name + " information storing in the database");

        // Make consumer chaining
        Consumer<Movies> chainedC = c1.andThen(c2).andThen(c3);

        Movies m1 = new Movies("Bahubali", "Hit");
        chainedC.accept(m1);
        Movies m2 = new Movies("Spider", "Flop");
        chainedC.accept(m2);
    }
}

/*
 * Output
 * Movie:Bahubali is ready to release
 * Movie:Bahubali is just Released and it is:Hit
 * Movie:Bahubali information storing in the database
 * Movie:Spider is ready to release
 * Movie:Spider is just Released and it is:Flop
 * Movie:Spider information storing in the database
 */
