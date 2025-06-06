package com.onlinetest.onlinetest;

import java.util.Arrays;

public class StringProcessor {


    /****
     *
     *輸入seaside the to sent be to ne2ds army ten of team a
     *
     * 產出a team of ten army needs to be sent to the seaside
     *
     * 輸入a3b4q2i abcd2 abc
     *
     * 產出abc abcdd aaabbbbqqi
     **/
    public static void main(String[] args) {

        String input = "seaside the to sent be to ne2ds army ten of team a";
        String[] split = input.split(" ");
        System.out.println(Arrays.asList(split));
        String result = "";
        for (int i = split.length - 1; i >= 0; i--) {
            result = depressString(result);
            result = result.concat(split[i]).concat(" ");
        }

        System.out.println(result);
    }

    private static String depressString(String input) {

        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            char ch = input.charAt(i);
            i++;
            int count = 0;

            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                count = count * 10 + (input.charAt(i) - '0');
                i++;
            }

            if (count == 0) {
                result.append(ch);
            } else {
                for (int j = 0; j < count; j++) {
                    result.append(ch);
                }
            }
        }
        return result.toString();


    }


}
