package org.example.Consumer;

import java.util.function.Consumer;

public class Sample {
    public static void main(String[] args) {
        Consumer<String> consumer = s-> System.out.println(s);
        consumer.accept("Ravi");
        consumer.accept("Sourav");
    }
}
