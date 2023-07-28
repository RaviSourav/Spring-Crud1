package org.example.LambdaExpression.WithCollection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DeafaultNSO {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3,5,1,9,0,34,21,45));
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
