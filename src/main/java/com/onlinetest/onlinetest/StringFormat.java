package com.onlinetest.onlinetest;

public class StringFormat {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "hello";
        String s3 = "JasonCC";

        System.out.println(String.format("%-12s", s1) + "100");
        System.out.println(String.format("%-12s", s2) + "010");
        System.out.println(String.format("%-12s", s3 )+ "010");
    }
}
