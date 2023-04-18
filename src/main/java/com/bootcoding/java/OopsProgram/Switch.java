package com.bootcoding.java.OopsProgram;

public class Switch
{

        String color;
        double price;
        String size;
        String shape;
        String type;

    public static void main(String[] args)
    {
        // creat a object....
        Switch sw = new Switch();
        // access the property...
        sw.color = "White";
        sw.price = 120;
        sw.type = "titan";
        sw.shape = "Circular";

        System.out.println("switch color is: " +sw.color);
        System.out.println("switch shape is: " +sw.shape);
        System.out.println("switch price is: " +sw.price);



    }

}
