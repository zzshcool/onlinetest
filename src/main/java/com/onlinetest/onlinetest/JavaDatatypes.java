package com.onlinetest.onlinetest;

import java.util.Scanner;


/***
 *
 * 5
 * -150
 * 150000
 * 1500000000
 * 213333333333333333333333333333333333
 * -100000000000000
 *
 ****/
public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < t; i++) {
            String input = sc.nextLine().trim();

            try {
                long val = Long.parseLong(input);
                System.out.println(input + " can be fitted in:");

                try {
                    Byte.parseByte(input);
                    System.out.println("* byte");
                } catch (Exception e) {
                }

                try {
                    Short.parseShort(input);
                    System.out.println("* short");
                } catch (Exception e) {
                }

                try {
                    Integer.parseInt(input);
                    System.out.println("* int");
                } catch (Exception e) {
                }

                System.out.println("* long"); // 一定能過，因為上面 Long.parseLong 沒丟錯
            } catch (Exception e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}
