package com.aish.java8._06predefineBiFunctinalInterface;

/**
 * Use Consumer to accept 2 input values and perform required operation and not required to return any result.
 * BiConsumer is exactly same as Consumer except that it will take 2 input arguments.
 */

//            interface BiConsumer<T, U>
//            {
//                public void accept(T t, U u);
//                //default method andThen()
//            }


import java.util.function.BiConsumer;


/**
 * @author Aishwarya Jorve
 */
public class _04BiConsumerDemo {
    public static void main(String[] args) {

        // BiConsumer to take two argument
        BiConsumer<String, String> c = (s1, s2) -> System.out.println(s1 + s2);
        c.accept("Aishwarya", "Jorve");
    }
}
