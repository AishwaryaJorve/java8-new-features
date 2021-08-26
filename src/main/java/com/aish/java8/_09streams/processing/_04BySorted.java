package com.aish.java8._09streams.processing;

/**
 * @author AishwaryaJorve
 *
 * Basic demo on sorted method
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _04BySorted {

    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(8);
        al.add(14);
        al.add(20);
        al.add(16);

        System.out.println(al);   //[10, 5, 8, 14, 20, 16]

        List<Integer> al2=al.stream().sorted().collect(Collectors.toList());
        System.out.println(al2);  //[5, 8, 10, 14, 16, 20]
    }
}
