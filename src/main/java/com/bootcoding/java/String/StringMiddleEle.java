package com.bootcoding.java.String;

public class StringMiddleEle {
    public static void main(String[] args) {
        // Print middle element in that string......

        String str = "Programming";
        int len = str.length();
        char ch = str.charAt(len/2);
        System.out.println(ch);

        // Print a in programming word...
        int r1 = str.indexOf('a');
        System.out.println(r1);
        int r2 = str.lastIndexOf('r');
        System.out.println(r2);

        // print ram in given word
        String word = "ram";
        if(str.contains(word)){
            System.out.println("ram");
        }

        // Print
        //str.substring(begin,end);
        String sub = str.substring(0,9);
        System.out.println(sub);
        String sub2 = str.substring(0, str.indexOf('n'));
        System.out.println(sub2);

        // Print (split).....
        String str1 = "java is a platform independent";
        System.out.println(str1.length());

        String[] tokens = str1.split(" ");
        for(int i=0; i<tokens.length; i++){
            System.out.println(tokens[i]);
        }

        String skills = "c,c++,java,python";
        String[] tech = skills.split(",");
        System.out.println("The candidates konws " + tech.length + " language");

        String str2 = "Java";
        char[] chars = str2.toCharArray();
        for(int i=0; i<chars.length; i++){
            System.out.println(chars[i]);
        }

    }
}
