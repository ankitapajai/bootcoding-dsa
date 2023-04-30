package com.bootcoding.java.String;

public class EscapeSequence {
    public static void main(String[] args) {
        // escape operator......
        System.out.println("I'm alright");
        System.out.println("I am software engineering in \"Google\"");
        System.out.println("\n Today is 14\\04\\2023");

        // WAP to print year-month-day.....
        String str1 = "2023-04-14";
        String[] str2 = str1.split("-");
        String year = str2[0];
        String month = str2[1];
        String day = str2[2];

        // print the string.....
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
