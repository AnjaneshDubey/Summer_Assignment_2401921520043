package Week2.Day1;
import java.util.*;
public class FirUnqChar {
    public static int firstUniqChar(String s) {
      s = s.toLowerCase();
      for(int i=0;i<s.length();i++) {
          char ch = s.charAt(i);
          if (s.indexOf(ch) == s.lastIndexOf(ch))
              return i;
      }
      return -1;
    }
    public static void main(String[] args) {
      Scanner ad = new Scanner(System.in);
      String s = ad.next();
      int k = firstUniqChar(s);
        System.out.println(k);

    }
}