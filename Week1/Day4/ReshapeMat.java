package Week1.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class ReshapeMat {
    public static int[][] matrixReshape(int[][] mat, int r, int c,int m,int n) {

        if( m*n != r*c)
            return mat;
        int[][] res = new int[r][c];
        int row=0,col=0;
        for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++) {
            res[row][col] = mat[i][j];
            col++;
            if (col == c) {
                col = 0;

                row++;}
        }}
    return res;
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter original row size");
        int row = ad.nextInt();
        System.out.println("Enter original column size");
        int col = ad.nextInt();
        int[][] mato = new int[row][col];
        System.out.println("Enter Matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++) {
                mato[i][j] = ad.nextInt();
            }}
        System.out.println("Enter reshaped row size");
        int r = ad.nextInt();
        System.out.println("Enter reshaped column size");
        int c = ad.nextInt();
      int[][] z =   matrixReshape(mato,r,c,row,col);
        System.out.println(Arrays.deepToString(z));
    }
}
