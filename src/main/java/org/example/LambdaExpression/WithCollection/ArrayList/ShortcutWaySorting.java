package org.example.LambdaExpression.WithCollection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class MyComparator1 implements Comparator<Integer>
{
    @Override
    public int compare(Integer I1, Integer I2) {
//        return (I1>I2)?1:((I1<I2)?-1:0);//DNSO
        return (I1>I2)?-1:((I1<I2)?1:0);//CSO
    }
}
public class ShortcutWaySorting {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3,5,1,7,9,0,12,43,21,54));
        System.out.println(arrayList);
        arrayList.sort(new MyComparator1());  //Collections.sort(arrayList,new MyComparator());
        System.out.println(arrayList);
    }
}
