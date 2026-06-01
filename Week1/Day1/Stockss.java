import java.util.*;
public class Stockss
{


        public static int maxProfit(int[] prices) {
            if (prices == null || prices.length < 2) {
                return 0;
            }

            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for (int price : prices) {
                if (price < minPrice) {
                    minPrice = price;
                } else if (price - minPrice > maxProfit) {
                    maxProfit = price - minPrice;
                }
            }

            return maxProfit;
        }

        public static void main(String[] args) {
            Scanner ad  = new Scanner(System.in);


            int n = ad.nextInt();


            int[] prices = new int[n];

            for (int i = 0; i < n; i++) {
                prices[i] = ad.nextInt();
            }


            int result = maxProfit(prices);

            System.out.println(result);


            ad.close();
        }
    }
