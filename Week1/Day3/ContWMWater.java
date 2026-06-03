package Week1.Day3;

import java.util.Scanner;

public class ContWMWater {

        public static int maxArea(int[] height) {
            int l = 0; int res = 0;
            int r = height.length-1;
            while(l<r)
            {
                int left = height[l];
                int right = height[r];
                int area = Math.min(left,right)*(r-l);
                res = Math.max(res,area);
                if(left<right)
                {
                    l++;
                }
                else
                    r--;
            }
            return res;

        }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int x = ad.nextInt();
        int[] height = new int[x];
        for(int i = 0; i<x;i++) {
            height[i] = ad.nextInt();}
            int z = maxArea(height);
            System.out.println(z);

    }
    }


