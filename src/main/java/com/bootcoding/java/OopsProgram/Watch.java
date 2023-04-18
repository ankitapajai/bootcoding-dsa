package com.bootcoding.java.OopsProgram;

public class Watch {

    // class doesn't hold value or memory.....
    // data member.....
        String brand;
        String color;
        String shape;
        String type;
        double price;

    public static void main(String[] args) {
        // object hold values of properties.....
        // Creat a object....
        Watch wall1 = new Watch();
        Watch wall2 = new Watch();

        // access the property or call a property using (.) dot operator...
          wall1.brand = "Titan";
          wall1.color = "Black";
          wall1.shape = "Circular";
          wall1.type = "HandWatch";
          wall1.price = 1200;

          wall2.brand = "Titan";
          wall2.color = "Brown";
          wall2.shape = "Circular";
          wall2.type = "WallWatch";
          wall2.price = 12000;

        System.out.println("wall1 color is = " +wall1.color);
        System.out.println("wall2 color is = " +wall2.color);


    }
}
