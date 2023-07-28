package org.example.LambdaExpression.WithCollection.Set;

import java.util.Set;
import java.util.TreeSet;

//The same way we have to use map

public class TreeSetCSOLambda {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>((I1,I2)-> (I1>I2)?-1:I1<I2?1:0); // this is the way to customize sorting order
        set.add(3);
        set.add(30);
        set.add(13);
        set.add(12);
        set.add(15);
        set.add(300);
        System.out.println(set);
//        set.stream().sorted((I1,I2)-> (I1>I2)?-1:I1<I2?1:0); // this will not work
        System.out.println(set);
    }
}
