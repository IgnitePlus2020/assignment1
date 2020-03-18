package com.tgt.igniteplus;
import java.util.*;
public class q17 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        for(int i=m;i<=n;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    count=1;
            }
            if(count==0)
                System.out.println(" "+i);
        }

    }
}
