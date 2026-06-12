package Week2.Day5;
import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
    if (strs == null || strs.length == 0) {
        return new ArrayList<>();
    }
    Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedKey = String.valueOf(charArray);


        if (!map.containsKey(sortedKey)) {
            map.put(sortedKey, new ArrayList<>());
        }
        map.get(sortedKey).add(s);
    }
        return new ArrayList<>(map.values());
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = scanner.next();
        }

        List<List<String>> result = groupAnagrams(input);
        System.out.println(result);
        scanner.close();
    }}