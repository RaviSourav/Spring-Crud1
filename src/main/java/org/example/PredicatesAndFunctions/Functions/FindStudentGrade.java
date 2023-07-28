package org.example.PredicatesAndFunctions.Functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindStudentGrade {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        populate(list);
        Function<Student,String> grade = s->{
            int marks = s.marks;
            if (marks>=90)
                return "A[Distinction]";
            else if(marks<90 && marks >=75)
                return "B[Very Good]";
            else if(marks<75 && marks >=60)
                return "C[First Class]";
            else if(marks>=50)
                return "D[Second Class]";
            else if(marks>=35)
                return "E[Third Class]";
            else
                return "Fail";
        };


        for (Student stu:list) {
            System.out.println("Student Name: "+stu.name);
            System.out.println("Student Marks: "+ stu.marks);
            System.out.println("Student Grade: "+ grade.apply(stu));
        }
        System.out.println();

        //Program to find Students Information including Grade by using Function whose marks are >=60:
        Predicate<Student> p = s-> s.marks>=60;
        for (Student stu:list) {
            if(p.test(stu))
            {
                System.out.println("Student Name: "+stu.name);
                System.out.println("Student Marks: "+ stu.marks);
                System.out.println("Student Grade: "+ grade.apply(stu));
            }
        }
    }

    public static void populate(ArrayList<Student> list) {
        list.add(new Student("Sunny",100));
        list.add(new Student("Bunny",65));
        list.add(new Student("Chinny",55));
        list.add(new Student("Vinny",45));
        list.add(new Student("Pinny",25));
}
}
