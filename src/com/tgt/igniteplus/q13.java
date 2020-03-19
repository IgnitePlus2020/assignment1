package com.tgt.igniteplus;
import java.util.*;
public class q13 {
    public static void main(String[] args)
    {
        System.out.println("Enter the number:");
        Scanner sd = new Scanner(System.in);
        int n = sd.nextInt();
        int p;
        for(int i=1;i<=n;i++)
        {
            p=1;
            for(int j=1;j<=i;j++)
                p=p*i;
            System.out.print(" "+p);
        }
    }
}
