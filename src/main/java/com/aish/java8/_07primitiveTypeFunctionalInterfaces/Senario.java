package com.aish.java8._07primitiveTypeFunctionalInterfaces;

public class Senario {

    public boolean test(int a[]) {
        boolean flag=false;
        if (a.length > 0) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 5) {
                    flag = false;
                    return false;
                } else {
                    System.out.println(a[i]);
                    flag = true;
                }
            }
        }

        System.out.println("After return false");
        return false;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Senario s = new Senario();
        s.test(a);
        System.out.println("In Main method");

    }
}
