package com.tgt.igniteplus;
import java.util.*;
public class q22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int l = sc.nextInt();
        int n=l-2;
        int a = 1;
        int b = -2;
        System.out.print(+a);
        System.out.print(" "+b);
        for (int i = 1; i <= n / 2; i++)
        {
            a+=3;
            b-=4;
            System.out.print(" "+a);
            System.out.print(" "+b);
        }
        System.out.println();
    }
}
