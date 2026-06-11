package Week2.Day4;

import java.util.*;

public class GenerateParenthesis {

    public static List<String> generateParenthesis(int n) {

        List<String>[] dp = new List[n + 1];

        dp[0] = Arrays.asList("");

        if (n >= 1) {
            dp[1] = Arrays.asList("()");
        }

        for (int i = 2; i <= n; i++) {

            dp[i] = new ArrayList<>();

            int inner = i - 1;
            int outer = 0;

            while (inner >= 0 && outer <= i - 1) {

                for (String in : dp[inner]) {

                    for (String out : dp[outer]) {

                        StringBuilder sb = new StringBuilder();

                        sb.append("(");
                        sb.append(in);
                        sb.append(")");
                        sb.append(out);

                        dp[i].add(sb.toString());
                    }
                }

                inner--;
                outer++;
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        List<String> result = generateParenthesis(n);

        System.out.println(result);

        sc.close();
    }
}
