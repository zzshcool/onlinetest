package com.onlinetest.onlinetest;

import java.util.Scanner;

public class JavaStringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // 1. 印出兩字串長度總和
        System.out.println(A.length() + B.length());

        // 2. 比較字典序
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. 兩字串第一個字母轉大寫後，印出
        System.out.println(capitalize(A) + " " + capitalize(B));
    }

    // 自訂函數：首字大寫
    public static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
