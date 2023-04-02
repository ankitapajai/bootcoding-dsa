// WAP to print even or odd number from CLA where user can provide multiple integer values......
package com.bootcoding.java.loop;
public class EvenOddNoUsingCla
{

        public static void main(String [] args)
        {


            for(int i=0; i<args.length; i++)
            {
                String value = args[i];
                int n = Integer.parseInt(value);

                if(n % 2 == 0)
                {
                    System.out.println(n + " is a even number");
                }
                else
                {
                    System.out.println(n + " is a odd number");
                }
            }
        }
   }

// Output:
// 1 is a odd number
// 2 is a even number
// 3 is a odd number
// 4 is a even number
// 5 is a odd number



