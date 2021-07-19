package com.aish.java8._09streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _01StreamsWithFilter {

    public static void main(String[] args) {
        ArrayList<Integer> i= new ArrayList<Integer>();
        i.add(1);
        i.add(10);
        i.add(14);
        i.add(11);
        i.add(79);

        System.out.println(i);

        // Using streams
        List<Integer> i1=i.stream().filter(l->l%2==0).collect(Collectors.toList());
        System.out.println(i1);


    }
}
