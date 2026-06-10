package Week2.Day3;

import java.util.Scanner;

public class RepeatedSubstring {
    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String middle = doubled.substring(1, doubled.length() - 1);
        return middle.contains(s);
    }
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = ad.nextLine();

        boolean result = repeatedSubstringPattern(s);

        System.out.println(result);

        ad.close();
    }
}
