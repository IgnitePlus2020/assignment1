package com.tgt.igniteplus;
import java.util.*;
public class q18 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        int f=1;
        for(int i=1;i<=x;i++)
            f=f*i;
        System.out.println(+f);

    }
}
