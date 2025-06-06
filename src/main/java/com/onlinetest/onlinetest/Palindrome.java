package com.onlinetest.onlinetest;


/***
 * madam -> yes
 * java ->no
 ***/
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("java"));
        System.out.println(isPalindrome("vvvvvvvv"));
        System.out.println(isPalindrome("vvvvvvv"));
        System.out.println(isPalindrome("vtvvvvov"));
    }

    private static boolean isPalindrome(String input) {

        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome2(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}
