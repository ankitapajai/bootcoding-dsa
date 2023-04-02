package com.bootcoding.java.method;

public class MaxElement
{

        public static void main(String[] args)
        {
            int arr[] = {10, 2, 19, -34, 20, 0, 199};
            int res = 0;
            res = findMaxElement(arr); // argument (input) // output
            System.out.println("The maximum Element is " + res);
        }

        public static int findMaxElement(int arr[])
        {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++)
            {
                if (max < arr[i])
                {
                    max = arr[i]; //set by new max value
                }
            }
            System.out.println(max);
            return max;
        }

    }

  //  Output:
  // The maximum element is 199...

