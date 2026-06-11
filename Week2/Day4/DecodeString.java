package Week2.Day4;

import java.util.*;
public class DecodeString {

    public static String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder crr = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {

                num = num * 10 + (ch - '0');

            } else if (ch == '[') {

                countStack.push(num);
                stringStack.push(crr);

                num = 0;
                crr = new StringBuilder();

            } else if (ch == ']') {

                int r = countStack.pop();
                StringBuilder previous = stringStack.pop();

                for (int i = 0; i < r; i++) {
                    previous.append(crr);
                }

                crr = previous;

            } else {

                crr.append(ch);
            }
        }

        return crr.toString();
    }

    public static void main(String[] args) {

        Scanner ad = new Scanner(System.in);

        System.out.print("Enter encoded string");
        String s = ad.nextLine();

        System.out.println("Decoded String" + decodeString(s));

        ad.close();
    }
}
