import java.util.*;

class RD_SortedArray {
    public static int removeDup(int[] nums) {

        if (nums.length == 0) return 0;

        int x = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[x]) {
                x = x + 1;
                nums[x] = nums[i];
            }
        }

        return x + 1;
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = ad.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = ad.nextInt();
        }


        int k = removeDup(nums);


        System.out.println(k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        ad.close();
    }
}