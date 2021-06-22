package com.aish.java8._05predefineFunctionalInterface.supplier;

/*
 * Supplier to supply system date
 */

import java.util.Date;
import java.util.function.Supplier;

/**
 * @author Aishwarya Jorve
 */
public class _02SupplySystemDate {
    public static void main(String[] args) {
        Supplier<Date> date = () -> new Date();
        System.out.println(date.get());
    }
}
