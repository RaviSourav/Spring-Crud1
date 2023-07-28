package org.example.LambdaExpression.WithCollection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingWithLambda {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3,5,1,7,9,0,12,43,21,54));
        System.out.println(arrayList);
        Collections.sort(arrayList,(I1,I2)-> (I1>I2)?1:((I1<I2)?-1:0)); //DNSO -> Ascending order
        System.out.println(arrayList);
        arrayList.sort((I1,I2)-> (I1>I2)?-1:((I1<I2)?1:0));//Descending order
        System.out.println(arrayList);
    }
}
