package com.aish.java8._07primitiveTypeFunctionalInterfaces;


/**
 * IntSupplier Basic Demo
 */

import java.util.function.IntSupplier;

/**
 * @author  Aishwarya Jorve
 */
public class _04IntSupplierDemo {
    public static void main(String[] args) {
        IntSupplier s=()->(int)(Math.random()*10);

        String otp="";
        for(int i =0;i<6;i++){

            // method getAsInt which can always takes primitive types as input and return primitive types
            otp=otp+s.getAsInt();
        }
        System.out.println("The 6 digit OTP: "+otp);
    }
}

/**
 * Output
 * The 6 digit OTP: 959767
 */