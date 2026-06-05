package Week1.Day5;
import java.util.*;
public class LCPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int plen = 0;
        while (true) {
            if (plen < strs[0].length()) {
                boolean check = true;
                char ch = strs[0].charAt(plen);
                for (int i = 0; i < strs.length; i++) {
                    if (plen < strs[i].length() && strs[i].charAt(plen) == ch) {
                    } else {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    plen++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return strs[0].substring(0, plen);
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int x =ad.nextInt();
         ad.nextLine();
        String[] strs = new String[x];
        for(int i=0; i<x;i++)
        {
           strs[i]= ad.nextLine();}

        String result = longestCommonPrefix(strs);
        System.out.println(result);
        ad.close();
    }

}
