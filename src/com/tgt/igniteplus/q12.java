package com.tgt.igniteplus;
import java.util.*;
public class q12 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sd = new Scanner(System.in);
        int n = sd.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.print(" " + i);
            else
                System.out.print(" -" + i);

        }
    }
}