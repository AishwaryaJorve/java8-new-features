package com.aish.java8._05predefineFunctionalInterface.supplier;

/*
 * Supplier Functional Interface contains only one abstract method get().
 * Supplier Functional interface does not contain any default and static methods.
 * Supplier won't take any input and it will always supply objects.
 *
 *     interface Supplier<R>
 *       {
 *           public R get();
 *       }
 */
import java.util.function.Supplier;

/**
 * @author Aishwarya Jorve
 */
public class _01SupplierDemo {

    public static void main(String[] args) {

        // Won't take input
        Supplier<String> s = () -> {
            String[] s1 = {"Sunny", "Bunny", "Chinny", "Pinny"};
            int x = (int) (Math.random() * 4);
            return s1[x];
        };

        // Call to get abstract method of Supplier.
        System.out.println(s.get());
    }
}
