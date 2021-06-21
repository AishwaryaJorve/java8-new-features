package com.aish.java8._05predefineFunctionalInterface.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Remove null from array
 * @author Aishwarya Jorve
 */
public class RemoveNullValuesFromStringArray {
    public static void main(String[] args) {
        String[] names={"Durga", "",null,"Ravi","Shivam","", null};

        Predicate<String> p=s->s!=null && s.length()!=0;

        ArrayList<String> l=new ArrayList<>();

        for(String s:names){
            if(p.test(s)){
                l.add(s);
            }
        }

        System.out.println("The list of valid Strings");
        System.out.println(l);
    }
}
