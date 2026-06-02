package Week1.Day2;
import java.util.*;
public class CDuplicate {



        public static boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for(int i=0; i<nums.length-1; i++)
            {
                if(nums[i]==nums[i+1])
                {
                    return true;
                }

            }
            return false;

        }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int x = ad.nextInt();
        int[] nums = new int[x];
        for(int i =0; i<x ;i++)
        {
          nums[i] = ad.nextInt(); }
          boolean has = containsDuplicate(nums);
        System.out.println(has);

    }}


