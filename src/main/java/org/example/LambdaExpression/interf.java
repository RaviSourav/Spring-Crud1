package org.example.LambdaExpression;

@FunctionalInterface
public interface interf {
//    public void methodOne();


    public void sum(int a,int b);


//    public void sum1();
    /* if we will write this and use as lambda expression in our main class implementation it will
       be directly considered as Functional interface otherwise it will work fine.
       If we have to make it Functional we can use annotation @FunctionalInterface
     */
}
