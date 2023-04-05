package com.bootcoding.java.arrays;

public class CopyEleReverseOrder {
    public static void main(String[] args) {
        // Copy elements of an array into another array in a reverse order.....
        int [] arr1 = {10,20,30,40,50};
        int [] arr2 = new int [arr1.length];
        System.out.println( "Original array: ");
        for(int i=0; i< arr1.length; i++)
        {
            System.out.println(arr1[i]+ "");
        }
        System.out.println("Reverse order: ");
        int index = arr1.length-1;
        for(int i=0; i< arr1.length; i++)
        {
            arr2[index--] = arr1[i];
        }
        for(int i=0; i< arr1.length; i++)
        {
            System.out.println(arr2[i]);
        }


    }
}
