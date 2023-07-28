package org.example.LambdaExpression.WithCollection.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDNSO {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(30);
        set.add(13);
        set.add(12);
        set.add(15);
        set.add(300);
        System.out.println(set);
    }
}
