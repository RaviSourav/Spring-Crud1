package org.example.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleForEach {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        System.out.println(list1);
        List<Integer> list2 = list1.stream().map(i -> i+10).collect(Collectors.toList());
        System.out.println(list2);
        List<Integer> list3 = list1.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println(list3);
        System.out.println(list2.stream().filter(i-> i%2==0).count());
        System.out.println(list1);

        //customize print using stream
        list1.stream().forEach(i-> System.out.print(i+" "));
        //standard print using stream
        list1.stream().forEach(System.out::println);

        //copy the element of the list to array
        Integer[] arr = list1.stream().toArray(Integer[]::new);
        System.out.println(arr);
        for (Integer i:arr) {
            System.out.print(i+" ");
        }

        System.out.println();
        Stream s1 = Stream.of(arr);
//        s1.forEach(System.out::print);  //here we can not use s1 at same place otherwise it will throw CE
        s1.forEach(i-> System.out.print(i+" ")); // Stream is already used
        Stream.of(arr).forEach(i-> System.out.print(i+" "));
    }
}
