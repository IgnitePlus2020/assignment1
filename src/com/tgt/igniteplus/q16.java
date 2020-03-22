package com.tgt.igniteplus;
import java.util.*;
public class q16 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        int a=1;
        int b=5;
        int y=1;
        System.out.print(+a);
        System.out.print(" "+b);
        for(int x=1;x<=n/2;x+=2)
        {
            a=a+(12*x);
            b=b+(24*y);
            y++;
            System.out.print(" "+a);
            System.out.print(" "+b);
        }

    }
}
