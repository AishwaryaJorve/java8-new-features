package com.aish.java8._05predefineFunctionalInterface.Predicate;

import java.util.function.Predicate;

public class StringStartsWithK {

    public static void main(String[] args) {
        String[] names={"sunny", "kajal", "Malika", "katrina", "kareena"};

        Predicate<String> startWithk=s -> s.charAt(0)=='k';
        System.out.println("Name starts with k are");

        for(String s:names){
            if(startWithk.test(s)){
                System.out.println(s);
            }
        }
    }

}
