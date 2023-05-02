package com.bootcoding.java.Leetcode;

public class TruncateSentence_1816
{
    public static void main(String[] args)
    {
        String s = "Hello how are you java programming";
        int k = 5;
        String sc = truncateSentence(s,k);
        System.out.println(sc);

    }
    public static String truncateSentence(String s, int k)
    {

        String[] str1 = s.split(" ");
        String[] str2 = new String[k];

        for (int i = 0; i < k; i++)
        {
            str2[i] = str1[i];
        }
        return String.join(" ", str2);
    }

}
