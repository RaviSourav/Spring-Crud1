package org.example;

public class ThrowsExample {
    public static void main(String[] args) {
        ThrowsExDemo throwsExDemo = new ThrowsExDemo();
        throwsExDemo.method(4,0);
    }
}
class ThrowsExDemo
{
    public void method(int m,int n) throws ArithmeticException
    {
        int x=0;
        try
        {
            x = m/n;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(x);
        }
    }
}