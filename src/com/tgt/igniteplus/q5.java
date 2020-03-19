package com.tgt.igniteplus;
import java.util.*;
public class q5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        int r=a%2;
        if(r==0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }
}
