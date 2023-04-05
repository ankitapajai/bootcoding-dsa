package com.bootcoding.java.arrays;

public class ArrayCopy {
    public static void main(String[] args)
    {
        int[] array = {10, 20, 30, 40, 50};
        int[] newArr = new int[array.length];
        for(int k = 0;k<array.length;k++)
        {
            newArr[k] = array[k];
            System.out.println(newArr[k]);
        }

    }
}
