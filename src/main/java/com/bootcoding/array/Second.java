package com.bootcoding.array;

public class Second {
    // Print even element of an array [7, 22, 19, 44, 45, 65, 66]...
        public static void main(String [] args){

            int[] num = {7,22,19,44,45,65,66};
            for(int i=0; i<num.length; i++){
                if(num[i] % 2 == 0){
                    System.out.println(num[i] + " is a even number ");
                }
            }
        }
    }

