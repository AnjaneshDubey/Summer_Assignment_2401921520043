package Week2.Day4;
import java.util.*;

public class ReverseWords3 {
    public static String reverseWords(String s) {
        s = s.strip();
        int len = s.length();
        String word = "";
        String newStr = "";
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            }
            else{
            for (int j = word.length()-1; j >= 0; j--) {

                newStr = newStr + word.charAt(j) ;
            }
                newStr += " ";

            word = "";
            }
        }
        for (int j = word.length() - 1; j >= 0; j--) {
            newStr += word.charAt(j);
        }
        return newStr;
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        String s = ad.nextLine();

        System.out.println(reverseWords(s));
        ad.close();
    }



}
