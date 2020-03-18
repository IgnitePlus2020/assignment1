package com.tgt.igniteplus;
import java.util.*;
public class q19 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal value:");
        int d=sc.nextInt();
        int binary[] = new int[40];
        int index = 0;
        while(d > 0)
        {
            binary[index++] = d%2;
            d = d/2;
        }
        for(int i = index-1;i >= 0;i--)
        {
            System.out.print(binary[i]);
        }
        System.out.println();
    }

}

