// WAP to print sum of even number from 1 to given number.....
package com.bootcoding.java.loop;

public class Sum_Of_Even_Number {
    public static void main(String [] args) {
        int i = 25, sum = 0;
        for (i = 1; i <= 25; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }

        System.out.println("The total of even number is: " + sum);
    }
}
