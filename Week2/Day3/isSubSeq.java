package Week2.Day3;

import java.util.Scanner;

public class isSubSeq {
    public static boolean isSubsequence(String s, String t) {
        int i= 0,j=0;
      while( i<s.length() &&  j <t.length())
        {
            if(s.charAt(i) == t.charAt(j))
                i++;
            j++;
    }
      return i == s.length();

}

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        String s = ad.next();
        String t = ad.next();
        System.out.println(isSubsequence(s,t));
    }}
