package Week1.Day5;

import java.util.Scanner;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String k = s.toLowerCase().replaceAll("[^a-z0-9]", "");
     int i; String L="";
     for( i = k.length()-1; i>=0; i--)
        {
             L = L + k.charAt(i);
        }
     if(k.equals(L))
     {
         return true;}
     return false;

    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        String s = ad.nextLine();
        boolean str = isPalindrome(s);
        System.out.println(str);
        ad.close();

    }
}
