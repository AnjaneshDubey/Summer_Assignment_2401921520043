package Week1.Day2;
import java.util.*;
public class MaxSubArray {

        public static int maxSubArray(int[] nums) {
         int max = Integer.MIN_VALUE;
         int sum = 0; int start = -1;


         for(int i =0;i<nums.length;i++)
         {
             if(sum ==0)
                 start = i;
             sum = sum + nums[i];
             if(sum > max)
             {
                 max = sum ;

             }
             if(sum<0) {
                 sum = 0;
             }
        }
return max;
}

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int x = ad.nextInt();
        int[] nums = new int[x];
        for(int i=0;i<x;i++)
        {
            nums[i] = ad.nextInt(); }
        int k =maxSubArray(nums);
        System.out.println(k);
    }}
