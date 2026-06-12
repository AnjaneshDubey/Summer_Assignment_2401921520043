package Week2.Day5;
import java.util.*;
public class StringCompression {
    public static int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            char currentch = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentch) {
                i++;
                count++;
            }

            chars[index++] = currentch;

            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int n = ad.nextInt();
        char[] chars = new char[n];

        for (int i = 0; i < n; i++) {
            chars[i] = ad.next().charAt(0);
        }

        int newLength = compress(chars);

        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println("\nNew Length: " + newLength);
        ad.close();
    }
}
