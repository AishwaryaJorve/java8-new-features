package com.aish.java8._09streams.processing;

/**
 * @author AishwaryaJorve
 *
 * Basic demo on collect method with map method
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _02ByCollectWithMap {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Aishi");
        al.add("mhashya");
        al.add("shubhi");
        al.add("bapu");
        al.add("Aishwarya");

        System.out.println(al); // [Aishi, mhashya, shubhi, bapu, Aishwarya]

        // Collect method use with map
        List<String> al2=al.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(al2);

    }
}
