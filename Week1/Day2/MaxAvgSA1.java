package Week1.Day2;
import java.util.*;
public class MaxAvgSA1 {

        public static double findMaxAverage(int[] nums, int k) {

            double sum = 0;
            for (int i = 0; i < k; i++) {
                sum = sum + nums[i];
            }

            double MaxSum = sum;


            for (int i = k; i < nums.length; i++) {

                sum = sum + nums[i] - nums[i - k];


                MaxSum = Math.max(MaxSum, sum);
            }


            return MaxSum / k;
        }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int x = ad.nextInt();
        int k = ad.nextInt();
        int[] nums = new int[x];
        for(int i=0; i<x;i++) {
            nums[i] = ad.nextInt();
        }
        double j = findMaxAverage(nums,k);
        System.out.println(j);

    }

    }

