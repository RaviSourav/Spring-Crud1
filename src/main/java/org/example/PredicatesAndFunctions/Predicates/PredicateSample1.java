package org.example.PredicatesAndFunctions.Predicates;

import java.util.function.Predicate;

public class PredicateSample1 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i-> (i>10);
        Predicate<Integer> p2 = i-> (i%2==0);
        System.out.println("If a no is greater than 10 "+ p1.test(100));
        System.out.println("If a no is greater than 10 "+ p1.test(5));
        System.out.println("If a no is even "+ p2.test(20));
        System.out.println("If a no is even "+ p2.test(15));

        Predicate<String> p3 = str -> (str.length()>5);
        Predicate<String> p4 = str -> (str.contains("abc"));
        System.out.println("IF string having length more than 5: "+ p3.test("abcdefgh"));
        System.out.println("IF string having length more than 5: "+ p3.test("abcd"));
        System.out.println("IF string contains abc: "+ p3.test("abcdefgh"));
        System.out.println("IF string contains abc: "+ p4.test("abdefgh"));


    }

}
