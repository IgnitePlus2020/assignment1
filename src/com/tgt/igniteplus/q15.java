package com.tgt.igniteplus;
import java.util.*;
public class q15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int sq;
        for (int i = 1; i <= a; i++) {
            if (i % 4 != 0) {

                sq = i * i;
                System.out.print(" " + sq);
            }
        }
    }
}

