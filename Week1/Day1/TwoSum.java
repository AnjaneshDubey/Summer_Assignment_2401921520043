package Week1.Day1;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int[] ts (int[] nums,int target)
    {

        int[] arr = new int[2];

        for(int i =0;i<nums.length;i++)
        {
            for(int j=i+1; j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }}}

             return arr;
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int x = ad.nextInt();

        int[] nums = new int[x];
        for(int i = 0; i<x;i++) {
            nums[i] = ad.nextInt();
        }
        int target = ad.nextInt();
        int[] z = ts(nums,target);
        System.out.println(Arrays.toString(z));
    }
}
