package org.example.LambdaExpression.WithCollection.CustomClass;

import java.util.ArrayList;
import java.util.Collections;

public class Handler {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Ravi"));
        employees.add(new Employee(3,"Sourav"));
        employees.add(new Employee(2,"Swati"));
        employees.add(new Employee(14,"Saloni"));
        employees.add(new Employee(5,"Sonali"));
        employees.add(new Employee(16,"Rupak"));
        System.out.println(employees);
        employees.forEach(i-> System.out.print(i.eno+" "+i.ename+" \n"));
        employees.forEach(System.out::println);

        //sorting based on Employee number
        employees.sort((e1,e2)-> e1.eno-e2.eno);
        employees.forEach(i-> System.out.print(i.eno+" "+i.ename+" \n"));
        System.out.println();

        //sorting based on Employee name
        employees.sort((e1,e2)-> e1.ename.compareTo(e2.ename));
        employees.forEach(i-> System.out.print(i.eno+" "+i.ename+" \n"));
        System.out.println();
        employees.sort((e1,e2)-> e2.ename.compareTo(e1.ename));
        employees.forEach(i-> System.out.print(i.eno+" "+i.ename+" \n"));
    }
}
