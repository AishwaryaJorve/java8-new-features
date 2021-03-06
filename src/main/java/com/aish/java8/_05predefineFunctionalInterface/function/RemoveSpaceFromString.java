package com.aish.java8._05predefineFunctionalInterface.function;

import java.util.function.Function;

/**
 * Remove all spaces from spring using Function interface
 * @author Aishwarya Jorve
 */
public class RemoveSpaceFromString {
    public static void main(String[] args) {
        String s="Durga Software Solution";
        Function<String,String> f=s1->s1.replaceAll(" ","");
        System.out.println(f.apply(s));
    }
}
