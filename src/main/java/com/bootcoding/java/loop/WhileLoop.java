// Reverse order program using while loop.....
package com.bootcoding.java.loop;

public class WhileLoop
{
        public static void main(String [] args)
        {
            int n = 1234;
            int r = 0;
            while( n != 0)
            {
                r = r*10+n%10;
                n = n/10;
            }
            System.out.println("Reverse sequence are: " +r);
        }
}



