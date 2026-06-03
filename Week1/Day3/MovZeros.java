package Week1.Day3;
import java.util.*;
public class MovZeros {
    public static void moveZeroes(int[] nums) {
        int i=0;

        for(int j=0; j<nums.length;j++)

        {
            if(nums[j]!=0)
            {
                swap(nums,i,j);
                i++;
            }
        }

    }
    public static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int x = ad.nextInt();
        int[] nums = new int[x];
        for(int i = 0; i<x;i++) {
            nums[i] = ad.nextInt();
        }

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}