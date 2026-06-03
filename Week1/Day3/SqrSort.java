package Week1.Day3;
import java.util.*;
public class SqrSort
{
    public static int[] sortedSquares(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int x = ad.nextInt();
        int[] nums = new int[x];
        for(int i = 0; i<x;i++) {
            nums[i] = ad.nextInt();
        }
        int[] k = sortedSquares(nums);
        System.out.println(Arrays.toString(k));
    }
    }

