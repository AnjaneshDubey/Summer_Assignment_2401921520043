package Week2.Day4;
import java.util.*;

public class ReverseWords3 {

        public static String reverseWords(String s) {
            String[] words = s.trim().split("\\s+");
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                result.append(new StringBuilder(words[i]).reverse());

                if (i < words.length - 1) {
                    result.append(" ");
                }
            }

            return result.toString();
        }


    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        String s = ad.nextLine();

        System.out.println(reverseWords(s));
        ad.close();
    }
}



