package com.tgt.igniteplus;
import java.util.*;
public class q14 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int l=sc.nextInt();
        int n=l-3;
        int a=1;
        int b=4;
        int c=7;
        int sum;
        System.out.print(+a);
        System.out.print(" " +b);
        System.out.print(" " +c);
        for(int i=1;i<=n;i++)
        {
            sum=a+b+c;
            System.out.print(" "+sum);
            a=b;
            b=c;
            c=sum;
        }
    }
}
