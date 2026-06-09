package Week2.Day2;
import java.util.*;

public class LongSubStrWORC {
    public static int lengthOfLongestSubstring(String s){
        int[] ch = new int[256];
       char[] str = s.toCharArray();
        Arrays.fill(ch, -1);
       int n = str.length;
       int l=0,r=0,maxlen=0;
       while(r<n) {
           if (ch[str[r]] != -1) {
               if (ch[str[r]] >= l) {
                   l = ch[str[r]] + 1;
               }
           }
           int len = r - l + 1;
           maxlen = Math.max(len, maxlen);
           ch[str[r]] = r;
           r++;
       }
       return maxlen;
           }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        String s = ad.next();
        System.out.println(lengthOfLongestSubstring(s));
    }
           }