package com.tgt.igniteplus;
import java.util.*;
public class q4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("AFTER SWAPPING");
        System.out.println("first number ="+a);
        System.out.println("second number ="+b);
    }

}
