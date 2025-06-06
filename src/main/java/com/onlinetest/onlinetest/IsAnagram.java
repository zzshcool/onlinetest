package com.onlinetest.onlinetest;

import java.util.Scanner;


/****
 * anagram
 * margana
 *
 * **/
public class IsAnagram {
    static boolean isAnagram(String a, String b) {
        // 長度不同就直接不是
        if (a.length() != b.length()) {
            return false;
        }

        return sortString(a.toLowerCase()).equals(sortString(b.toLowerCase()));
    }

    private static String sortString(String stra) {

        String[] list = new String[stra.length()];
        for (int i = 0; i < stra.length(); i++) {
            list[i] = String.valueOf(stra.charAt(i));
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                String t1 = list[j];
                if (list[i].charAt(0) > list[j].charAt(0)) {
                    String tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }

        String result = "";
        for (String s : list) {
            result = result + s;
        }

        return result;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
