package Week2.Day3;

import java.util.Scanner;

public class FirstOcc {

    public static int strStr(String haystack, String needle) {
        haystack = haystack.toLowerCase();
        needle = needle.toLowerCase();
        return haystack.indexOf(needle);

    }


    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        String haystack = ad.next();
        String needle = ad.next();
        System.out.println(strStr(haystack,needle));
    }
}
