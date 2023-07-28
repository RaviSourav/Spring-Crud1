package org.example.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Sample1 {
    public static void main(String[] args) {
        //to collect only even numbers from Arraylist
        List<Integer> list1 = new ArrayList<>();
        for(int i=0;i<10;i++)
            list1.add(i);
        //without Stream -> use loop and condition and add to new list
        //with Stream
        List<Integer> list2 = list1.stream().filter(i-> i%2 == 0).collect(Collectors.toList());
        System.out.println(list2);


        //Count number of Strings present in list length of 5 or max
        List<String> list3 = new ArrayList<>(Arrays.asList("Swati","abc","Ravi","RaviS","Saloni","Sonali"));
        List<String> list4 = list3.stream().filter(s-> s.length()>5).collect(Collectors.toList());
        System.out.println(list4);
        System.out.println(list3.stream().filter(s-> s.length()>=5).count());


        //change every letter to uppercase
        List<String> list5 = list3.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list5);

        //sort an array using sorted()
        List<Integer> list6 = new ArrayList<>(){{
            add(10);
            add(7);
            add(3);
            add(8);
            add(18);
            add(13);
        }};
        System.out.println(list6.stream().sorted().collect(Collectors.toList()));
        System.out.println(list6.stream().sorted((s1,s2)-> s2.compareTo(s1)).collect(Collectors.toList()));


        //min() and max() in stream
        System.out.println(list3.stream().min((s1,s2)-> s1.compareTo(s2)).get());
        System.out.println(list3.stream().min((s1,s2)-> s2.compareTo(s1)).get());
        System.out.println(list3.stream().max((s1,s2)-> s1.compareTo(s2)).get());
        System.out.println(list3.stream().max((s1,s2)-> s2.compareTo(s1)).get());
        System.out.println(list6.stream().min((s1,s2)-> s1.compareTo(s2)).get());
        System.out.println(list6.stream().max((s1,s2)-> s1.compareTo(s2)).get());
        System.out.println(list6.stream().min((s1,s2)-> s1-s2).get());




        //example to use static arrsylist
//        List<Integer> list_sample2 = new ArrayList<>(Arrays.asList(1,23,34));
//        List<String> list_sample1 = new ArrayList<>(){{
//            add("abc");
//        }};
    }
}
