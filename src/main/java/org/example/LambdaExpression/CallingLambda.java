package org.example.LambdaExpression;

public class CallingLambda {
    public static void main(String args[])
    {
//        //Without Lambda
//        interf interf = new LambdaExpressionBasic();
//        interf.methodOne();
//
//        //With Lambda expression
//        interf interf1 = () -> System.out.println("With Lambda Expression");
//        interf1.methodOne();

        int m = 20, n = 5 , p= 30;
        //without Lambda Expression
        interf interf = new LambdaExpressionBasic();
        interf.sum(m,n);

        //with Lambda Expression
        interf interf1 = (a,b) -> System.out.println(a+b);
        interf1.sum(m,p);
    }
}
