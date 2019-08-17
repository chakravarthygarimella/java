/**
 * 
 */
package com.java.java8;

import java.util.function.BiConsumer;

/**
 * @author Chakravarthy Garimella (cgarim823)
 * Jul 25, 2019
 *
 */
public class BiConsumerInterfacePractice {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> consumer = (a, b) -> {
            System.out.println(a + b);
        };
        consumer.accept(5, 8);

    }

}
