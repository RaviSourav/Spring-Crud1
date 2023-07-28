package org.example.PredicatesAndFunctions.Functions;

import java.util.Arrays;
import java.util.function.Function;

public class PlayWithStrings {
    public static void main(String[] args) {
        //Program to remove spaces present in the given String by using Function:
        String str = "Ravi Sourav pvt ltd company     Thanks";
        Function<String,String> removeSpace = s -> s.replaceAll("     "," ");
        System.out.println(removeSpace.apply(str));

        //Program to find Number of spaces present in the given String by using Function:
        Function<String,Integer> countSpace = s -> s.length() - s.replaceAll(" ","").length();
        System.out.println(countSpace.apply(str));
    }
}
