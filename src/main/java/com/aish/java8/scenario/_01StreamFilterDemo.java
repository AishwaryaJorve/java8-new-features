package com.aish.java8.scenario;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// If we have list find all integers greater than 15
public class _01StreamFilterDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(12);
        list.add(15);
        list.add(19);


        List<Integer> newList;
        newList=list.stream().filter(x->x>=15).collect(Collectors.toList());

        System.out.println(newList);
    }
}

// Output

//[15, 19]
