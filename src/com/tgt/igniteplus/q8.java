package com.tgt.igniteplus;

import java.util.*;
public class q8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        int even,odd;
        even=0;
        odd=0;
        int i;
        for(i=1;i<=x;i++)
        {
            if(i%2==0)
                even=even+i;

            else
                odd=odd+i;
        }
        System.out.println("Sum of odd numbers="+odd);
        System.out.println("Sum of even numbers="+even);
    }

}
