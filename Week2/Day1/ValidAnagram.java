package Week2.Day1;

import java.util.Arrays;
import java.util.Scanner;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] ns = s.toCharArray();
        char[] nt = t.toCharArray();
        Arrays.sort(ns);
        Arrays.sort(nt);
        return Arrays.equals(ns, nt);
    }
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        String s = ad.next();
        String t = ad.next();
        boolean k = isAnagram(s,t);
        System.out.println(k);
    }
}
