package com.aish.java8._09streams;

/**
 * Find Even number from List
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Aishwarya Jorve
 */
public class _01StreamsWithFilter {

    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(1);
        i.add(10);
        i.add(14);
        i.add(11);
        i.add(79);

        System.out.println(i);

        // Using Streams
        List<Integer> i1 = i.stream().filter(l -> l % 2 == 0).collect(Collectors.toList());
        System.out.println(i1);
    }
}
/**
 * Output
 * [1, 10, 14, 11, 79]
 * [10, 14]
 */