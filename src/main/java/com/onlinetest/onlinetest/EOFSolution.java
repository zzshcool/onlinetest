package com.onlinetest.onlinetest;

import java.util.Scanner;


/*****
 * Hello world
 * I am a file
 * Read me until end-of-file.
 *
 ****/
public class EOFSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (sc.hasNextLine()) {
            String s1 = sc.nextLine();
            System.out.println(i + " " + s1);
            i++;
        }
    }
}
