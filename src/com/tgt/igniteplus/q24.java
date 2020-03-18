package com.tgt.igniteplus;
import java.util.*;
public class q24 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the values to calculate X raised to n:");
        int x=sc.nextInt();
        int n=sc.nextInt();
        int prod=1;
        for(int i=1;i<=n;i++)
        {
            prod=prod*x;
        }
        System.out.println("The answer is "+prod);

    }
}
