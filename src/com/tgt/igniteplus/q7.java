package com.tgt.igniteplus;
import java.util.Scanner;
public class q7
{
    public static void main(String[] args)
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
            if(y>z)
                System.out.println("Second largest number is: "+y);
            else
                System.out.println("Second largest number is:"+z);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
            if(x>z)
                System.out.println("Second largest number is: "+x);
            else
                System.out.println("Second largest number is: "+z);
        }
        else
        {
            System.out.println("Largest number is:"+z);
            if(x>y)
                System.out.println("Second largest number is: "+x);
            else
                System.out.println("Second largest number is: "+y);
        }

    }
}