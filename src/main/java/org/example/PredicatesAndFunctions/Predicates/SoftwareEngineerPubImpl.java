package org.example.PredicatesAndFunctions.Predicates;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Predicate;

public class SoftwareEngineerPubImpl {
    public static void main(String[] args) {
        SoftwareEngineer[] softwareEngineers = new SoftwareEngineer[]{
                new SoftwareEngineer("Sunil",25,true),
                new SoftwareEngineer("Sayan",26,true),
                new SoftwareEngineer("Subbu",28,false),
                new SoftwareEngineer("Ravi",17,true),
                new SoftwareEngineer("Amit",26,false)
        };
        Predicate<SoftwareEngineer> isAllowedInPub = se -> se.isHavingGf==true && se.age>=18;
        Arrays.stream(softwareEngineers).forEach(se -> System.out.print(isAllowedInPub.test(se)+" "));
    }
}
