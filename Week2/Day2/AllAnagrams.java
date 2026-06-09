package Week2.Day2;
import java.util.*;

class AllAnagrams{
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        if (n < m) {
            return ans;
        }

        int[] pFreq = new int[26];
        int[] winFreq = new int[26];


        for (int i = 0; i < m; i++) {
            pFreq[p.charAt(i) - 'a']++;
            winFreq[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pFreq, winFreq)) {
            ans.add(0);
        }

        for (int i = m; i < n; i++) {
            winFreq[s.charAt(i) - 'a']++;
            winFreq[s.charAt(i - m) - 'a']--;
            if (Arrays.equals(pFreq, winFreq)) {
                ans.add(i - m + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        AllAnagrams sol = new AllAnagrams();
        Scanner ad = new Scanner(System.in);
        String s = ad.next();
        String p = ad.next();

        List<Integer> result = sol.findAnagrams(s, p);

        System.out.println(result);
    }
}