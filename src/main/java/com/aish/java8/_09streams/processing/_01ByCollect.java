package com.aish.java8._09streams.processing;

/**
 * @author AishwaryaJorve
 *
 * Basic demo on collect method
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _01ByCollect {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Aishi");
        al.add("mhashya");
        al.add("shubhi");
        al.add("bapu");
        al.add("Aishwarya");

        System.out.println(al); // [Aishi, mhashya, shubhi, bapu, Aishwarya]

        // Collect method use
        List<String> al1=al.stream().filter(s->s.length()>=9).collect(Collectors.toList());
        System.out.println(al1); // [Aishwarya]
    }
}
