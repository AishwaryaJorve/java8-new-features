package com.aish.java8._09streams.processing;


/*
  @author AishwaryaJorve
 *
 * Basic demo forEach method
 */

import java.util.ArrayList;

public class _07ByForEachMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(8);
        al.add(14);
        al.add(20);
        al.add(16);

        System.out.println(al);   //[10, 5, 8, 14, 20, 16]

        al.stream().forEach(s-> System.out.println(s)); // will print each element one by one

    }
}
