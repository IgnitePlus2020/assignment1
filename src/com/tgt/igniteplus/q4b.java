package com.tgt.igniteplus;
import java.util.*;
public class q4b {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the three numbers a,b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int temp,temp1;
        temp=a;
        a=b;
        b=temp;
        temp1=a;
        a=c;
        c=temp1;
        System.out.println("After swapping a,b,c=");
        System.out.println(+a);
        System.out.println(+b);
        System.out.println(+c);

    }
}
