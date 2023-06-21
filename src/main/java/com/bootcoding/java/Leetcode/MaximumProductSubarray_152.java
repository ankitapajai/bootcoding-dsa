package com.bootcoding.java.Leetcode;

public class MaximumProductSubarray_152 {
    public static void main(String[] args) {
        //Declare and initialize the array...
        int[] nums = {2,3,-2,4};
        //Method calling.....
        MaximumProductSubarray_152 m1 = new MaximumProductSubarray_152();
        int result = m1.maxProduct(nums);
        System.out.println(result);
    }

  //Method definition......
  public int maxProduct(int[] nums)
  {
      int n = nums.length;
      int max = nums[0];
      int min = nums[0];
      int ans = nums[0];

      for (int i = 1; i < n; ++i)
      {
          int temp = max;

          max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
          min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);

          if (max > ans)
          {
              ans = max;
          }
      }
      return ans;
  }
}
