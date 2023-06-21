package com.bootcoding.java.Leetcode;

public class MaximumSubarray_53
{
    public static void main(String[] args)
    {
        //Declare and initialize yhe array......
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //Method Calling......
        MaximumSubarray_53 s1 = new MaximumSubarray_53();
        int result = s1.maxSubArray(nums);
        System.out.println(result);
}

  //Method definition....
  public int maxSubArray(int[] nums) {

      int n = nums.length;
      int sum = 0;
      int max = nums[0];
      for(int i=0; i<n; ++i){
          sum = sum + nums[i];
          if(sum > max)
          {
              max = sum;
          }
          if(sum < 0)
          {
              sum = 0;
          }
      }
      return max;

  }
}
