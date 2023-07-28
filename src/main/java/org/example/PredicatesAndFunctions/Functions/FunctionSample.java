package org.example.PredicatesAndFunctions.Functions;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<String,Integer> f1 = str -> (str.length());
        System.out.println(f1.apply("Ravi Sourav"));

        Function<Integer,Integer> f2 = i-> {
        int m = (i * i + i * i);
        return m * m;
        };
        System.out.println(f2.apply(2));
    }
}
