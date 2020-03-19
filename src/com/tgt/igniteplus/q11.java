package com.tgt.igniteplus;
import java.util.*;
public class q11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int sq=0;
        for(int i=2;i<=n;i+=2)
        {
            sq=0;
            if(i%2==0)
            {
                sq=i*i;
                System.out.print(" "+sq);

            }
        }
    }
}