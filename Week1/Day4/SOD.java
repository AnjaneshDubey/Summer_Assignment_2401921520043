package Week1.Day4;

import java.util.Scanner;

public class SOD {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {

            totalSum += mat[i][i];

            totalSum += mat[i][n - 1 - i];
        }


        if (n % 2 != 0) {
            totalSum -= mat[n / 2][n / 2];
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);

        System.out.print("Enter matrix size");
        int x = ad.nextInt();


        int[][] mat = new int[x][x];

        System.out.println("Enter matrix elements row by row:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                mat[i][j] = ad.nextInt();
            }
        }

        int result = diagonalSum(mat);
        System.out.println(result);

        ad.close();
    }
}