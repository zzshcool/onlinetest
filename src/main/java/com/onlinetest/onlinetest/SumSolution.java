package com.onlinetest.onlinetest;

import java.util.Scanner;


/**
 * 2
 * 0 2 10
 * 5 3 5
 ****/
public class SumSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum(a, b, n);
            System.out.println();
        }
        in.close();
    }

    public static void sum(int a, int b, int n) {
        int result = a;
        int pow = 1; // 相當於 2^0

        for (int i = 0; i < n; i++) {
            result += pow * b;
            System.out.print(result + " ");
            pow *= 2; // 下一次變 2^1, 2^2, 2^3...
        }
    }
}
