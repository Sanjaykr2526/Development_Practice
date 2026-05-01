package com.interview.CoreJava;

public class ReverseString {

    static void main(String[] args) {
        String str="Sanjay";
        String output=reverseString(str);
        System.out.println("Reverse String is :"+output);
    }

    public static String reverseString(String str)
    {
        char[] arr=str.toCharArray();
        int l=0,r=arr.length-1;
        while(l<r)
        {
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return new String(arr);

    }
}
