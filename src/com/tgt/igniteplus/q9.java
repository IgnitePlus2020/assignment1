package com.tgt.igniteplus;
import java.util.*;
public class q9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int x=n;
        int temp,sum;
        sum=0;
        while(x>0)
        {

            temp=x%10;
            sum=(sum*10)+temp;
            x=x/10;
        }
        System.out.println("The reversed number is "+sum);
    }
}