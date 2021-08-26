package com.aish.java8._09streams.processing;

/**
 * @author AishwaryaJorve
 *
 * Basic demo on count method with filter method
 * count no of elements whose length greater than 7
 */

import java.util.ArrayList;

public class _03ByCountWithFilter {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Aishi");
        al.add("mhashya");
        al.add("shubhi");
        al.add("bapu");
        al.add("Aishwarya");

        System.out.println(al); // [Aishi, mhashya, shubhi, bapu, Aishwarya]

        long count=al.stream().filter(s -> s.length()>=7).count();

        System.out.println(count); // 2

    }
}
