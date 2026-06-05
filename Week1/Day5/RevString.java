package Week1.Day5;


import java.util.Arrays;
import java.util.Scanner;

public class RevString {
    public static void reverseString(char[] s) {


                int start = 0;
                int end = s.length-1;
                while(start<=end)
                {
                    char temp = s[end];
                    s[end] = s[start];
                    s[start] = temp;
                    start++;
                    end--;
                }
            }



    public static void main(String[] args) {
        Scanner ad= new Scanner(System.in);
        String ip = ad.next();
        char[] s = ip.toCharArray();
        reverseString(s);
        System.out.println(Arrays.toString(s));
        }
        }


