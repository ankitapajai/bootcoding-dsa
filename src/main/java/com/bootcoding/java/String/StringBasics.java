package com.bootcoding.java.String;

public class StringBasics {
    public static void main(String[] args) {
        // There are two ways to creat a String in java....
        // 1) String name = "Hello";
        // 2) String name = new String ("Hello");

        // Creat a String.....
        String s1 = "DIWALI";
        String s2 = "diwali";

        // String methods LowerCase & UpperCase
        String s3 = s1.toLowerCase();
        String s4 = s2.toUpperCase();

        String s5 = "Haldiram";
        String s6 = "Haldiram b";
        boolean res = s1.equals(s2);
        System.out.println(res);

        // length of String....
        int len = s5.length();

        // print the String.....
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s6.length());
        System.out.println(s5.length());

    }
}
