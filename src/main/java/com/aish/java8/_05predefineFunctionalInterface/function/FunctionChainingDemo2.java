package com.aish.java8._05predefineFunctionalInterface.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChainingDemo2 {
    public static void main(String[] args) {

        // first expression
        Function<String, String> f1 = s -> s.toLowerCase();

        // Second expression
        Function<String, String> f2 = s -> s.substring(0, 5);

        // scanner to take I/P
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name:");
        String username = sc.next();
        System.out.println("Enter Password:");
        String pwd = sc.next();

        // durga, durgasoft, DUrga can accept as userName
        if (f1.andThen(f2).apply(username).equals("durga") && pwd.equals("java")) {
            System.out.println("Valid User");
        } else {
            System.out.println("Invalid User");
        }

    }
}
