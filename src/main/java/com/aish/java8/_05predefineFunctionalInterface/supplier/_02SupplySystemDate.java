package com.aish.java8._05predefineFunctionalInterface.supplier;

/*
 * Supplier to supply system date
 * Random OTP
 */

import java.util.Date;
import java.util.function.Supplier;

/**
 * @author Aishwarya Jorve
 */
public class _02SupplySystemDate {
    public static void main(String[] args) {

        // Supplier for otp
        Supplier<String> otps= () -> {
            String otp = "";
            for (int i = 1; i <= 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };

        // Supplier for date
        Supplier<Date> date = () -> new Date();

        System.out.println(date.get());
        System.out.println(otps.get());
        }
    }
