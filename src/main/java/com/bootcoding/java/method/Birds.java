
package com.bootcoding.java.method;

public class Birds
{
    public void eat()          // creat a method.....
    {
        System.out.println("I am eating....");
    }

    public static void main(String[]args)
    {
        System.out.println("2");
        Birds sc = new Birds();  // creat an object...
        sc.eat();                // call a method...
        sc.fly();
    }

    public void fly()
    {
        System.out.println("I am flying.....");
    }
}