package com.bootcoding.java.arrays;

public class OddEleInReverseOrder {
    // Copy odd element of an array into another in a reverse order......
    public static void main(String[] args) {
        int [] arr1 = {2,3,4,5,6,7};
        int count = 0;
        for(int i=0; i< arr1.length; i++)
        {
            if(arr1[i] % 2 != 0)
            {
                count++;
            }
        }
        int [] arr2 = new int [count];
        System.out.println("original array: ");
        for(int i=0; i< arr1.length; i++)
        {
            System.out.println(arr1[i]+ "");
        }
        System.out.println("Reverse order: ");
        int index = arr2.length-1;
        for(int i=0; i< arr1.length; i++)
        {
            if(arr1[i] % 2 != 0)
            {
                arr2[index--] = arr1[i];
            }
        }
        for(int i=0; i< arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }

    }
}
