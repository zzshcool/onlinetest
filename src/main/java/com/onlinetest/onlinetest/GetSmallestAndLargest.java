package com.onlinetest.onlinetest;



/***
 * welcometojava
 * k=3 wel elc lco ome ...
 * 找出字串最大的
 *
 * **/
public class GetSmallestAndLargest {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava",2));
        System.out.println();
        System.out.println(getSmallestAndLargest("welcometojava",3));
        System.out.println();
        System.out.println(getSmallestAndLargest("welcometojava",4));
        System.out.println();
        System.out.println(getSmallestAndLargest("welcometojava",5));
    }


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);

            if (smallest.compareTo(sub) > 0) smallest = sub;
            if (largest.compareTo(sub) < 0) largest = sub;
        }

        return smallest + "\n" + largest;
    }
}
