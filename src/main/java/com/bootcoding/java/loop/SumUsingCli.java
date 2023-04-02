// WAP a program of sum of all number by using CLI....
package com.bootcoding.java.loop;
public class SumUsingCli
{
    public static void main(String [] args)
        {
            int sum = 0;
            for(int i=0; i<args.length; i++)
            {
                String value = args[i];
                int n = Integer.parseInt(value);

                sum = sum + n;
            }
            System.out.println("The sum of all number is: " +sum);
        }
    }

// Output:
//  input: 10 20
// The sum of all number is: 30


