package com.onlinetest.onlinetest;

public class StringToken {

    public static void main(String[] args) {
        String s = "Hello, world! 123 Go.";
        String[] tokens = s.trim().split("[^a-zA-Z]+");


        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
