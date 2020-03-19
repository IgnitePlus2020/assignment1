package com.tgt.igniteplus;
import java.util.*;
public class q3 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the principal:");
        double p=sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        int r=sc.nextInt();
        System.out.println("Enter the time period:");
        int t=sc.nextInt();
        double s=(p*t*r)/100;
        System.out.println("The simple interest="+s);
    }
}
