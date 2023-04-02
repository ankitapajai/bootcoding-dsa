package com.bootcoding.java.basic;

public class Palindrom_Number
{
    public static void main(String[] args)
    {

        for (int i = 0; i <= 2; i++)
        {
            String value = args[i];
            int a = Integer.parseInt(value);

            int temp = a;
            int r = 0;
            while (a != 0)
            {
                r = r * 10 + a % 10;
                a = a / 10;
            }


            if (r == temp)
            {
                System.out.println(r + " is a palindrom number: ");
            } else
            {
                System.out.println(r + " is not a palindrom number: ");
            }

        }
    }
}



