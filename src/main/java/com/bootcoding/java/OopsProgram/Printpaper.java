package com.bootcoding.java.OopsProgram;

public class Printpaper {

        String name;
        String color;
        double price;
        String type;
        String brand;

    public static void main(String[] args) {
        //  object..
        Printpaper paper = new Printpaper();
        Printpaper paper2 = new Printpaper();

        paper.color = "White";
        paper.name = "paper";
        paper.price = 20.00;
        paper.type = "drawing";
        paper.brand = "JK";

        paper2.color = "Yellow";
        paper2.name = "Scrapbook";
        paper2.price = 25.00;
        paper2.type = "Floral";
        paper2.brand = "MK";

        System.out.println("paper color is: " +paper.color);
        System.out.println("paper price is: " +paper.price);
        System.out.println("paper brand is: " +paper.brand);
        System.out.println("paper type is: " +paper.type);

        System.out.println(" "); // for middle space

        System.out.println("paper2 color is: " +paper2.color);
        System.out.println("paper2 price is: " +paper2.price);
        System.out.println("paper2 brand is: " +paper2.brand);
        System.out.println("paper2 type is: " +paper2.type);


    }
}
