package com.bootcoding.java.Leetcode;

public class ProductExceptSelf_238 {
    public static void main(String[] args) {
        //Declare and initialize the array......
        int[] nums = {1,2,3,4};
        //Method calling......
        int[] result = productExceptSelf(nums);
        for(int i=0; i<nums.length; i++)
        {
            System.out.println(result[i]);
        }
    }

    //Method definition.......
    public static int[] productExceptSelf(int[] nums)
    {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            arr[i]=1;
        }
        int pre = 1; // pre all left elements.....
        for(int i=0; i<nums.length; i++)
        {
            arr[i]=arr[i] * pre;
            pre = pre*nums[i];
        }
        int suf = 1; // suf all right elements....
        for(int i=nums.length-1; i>=0; i--)
        {
            arr[i] = arr[i]*suf;
            suf = suf*nums[i];
        }
        return arr;
    }
}
