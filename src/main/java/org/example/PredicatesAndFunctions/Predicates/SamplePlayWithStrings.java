package org.example.PredicatesAndFunctions.Predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SamplePlayWithStrings {
    public static void main(String[] args) {
        String[] str = new String[]{"Sunny","Kajal","Mallika","Katrina","Kareena"};


        //1. String Starts with K
        Predicate<String> startsWithK = s-> s.charAt(0)=='K';
        for (String s:str) {
            if (startsWithK.test(s))
                System.out.println(s);
        }

        //2.Remove null values and empty strings from the given list
        String[] names={"Durga","",null,"Ravi","","Shiva",null};
        Predicate<String> removeNull = s-> s!=null && !s.isEmpty();
        List<String> list = new ArrayList<>();
        for (String s:names) {
            if (removeNull.test(s))
                list.add(s);
        }
        System.out.println(list);
    }
}
