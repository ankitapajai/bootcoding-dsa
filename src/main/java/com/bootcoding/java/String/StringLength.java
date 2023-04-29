package com.bootcoding.java.String;

public class StringLength {
    public static void main(String[] args) {
        // creat a string...
        String First = "Hello";
        String Second = "Java";
        String Third = "programming";

        // print string.....
        System.out.println(First);
        System.out.println(Second);
        System.out.println(Third);

        // get length of string....
        // creat a string..
        String str1 = "Programming";
        System.out.println("String : " +str1);

        // get the length of str1..
        int length = str1.length();
        System.out.println("length: " +length);

        // join of two string.....
        String String1 = "Mount";
        System.out.println("string1: " +String1);
        String String2 = "Everest";
        System.out.println("Strung2: " +String2);
        String joinedString = String1.concat(String2);
        System.out.println("Joined String: " +joinedString);


    }
}