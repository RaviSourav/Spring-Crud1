package org.example.LambdaExpression.WithCollection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>
{
    @Override
    public int compare(Integer I1, Integer I2) {
        if(I1<I2)
            return 1;
        else if (I1>I2) {
            return -1;
        }
        else
            return 0;
    }
}

public class CustomizeSO {
    public static void main(String[] args) {
//        Integer[] a = new Integer[]{3,2,5,4,1};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3,5,1,7,9,0,12,43,21,54));
        System.out.println(arrayList);
//        Collections.sort(arrayList,new MyComparator()); //Descending order
        arrayList.sort(new MyComparator());
//        Arrays.sort(a,new MyComparator());
//        Arrays.stream(a).sorted().forEach(i-> System.out.print(i+" "));
//        Arrays.stream(a).forEach(i-> System.out.print(i+" "));
        System.out.println(arrayList);
    }
}
