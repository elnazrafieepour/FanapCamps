package Keshtiban;

import java.util.Arrays;
import java.util.Scanner;

public class Exc1 {
public static int[][] updateMtr(int[][] mtr) {
    int size = mtr.length;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {

            if (i - 1 >= 0 || j - 1 >= 0 || i + 1 < size || j + 1 < size) {
                int neighbor = mtr[i][j - 1] + mtr[i][j + 1] + mtr[i - 1][j] + mtr[i + 1][j] + mtr[i - 1][j - 1] + mtr[i - 1][j + 1] + mtr[i + 1][j - 1] + mtr[i + 1][j = 1];

                if (mtr[i][j] == 1) {
                    if (neighbor < 2) {
                        mtr[i][j] = 0;
                    } else if (neighbor >= 2) {
                        mtr[i][j] = 1;
                    } else if (neighbor > 3) {
                        mtr[i][j] = 0;
                    }

                } else {
                    if (neighbor == 3) {
                        mtr[i][j] = 1;
                    } else {
                        mtr[i][j] = 0;
                    }
                }

            }
        }
    }
    return mtr;
}

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Input the size of Matrix: ");
        int input = scanner.nextInt();
        System.out.println("Please Input data for Matrix: ");
        int[][] Mtr =new int[input][input];
        for (int i= 0; i< input; i++){
            for (int j=0; j< input; j++){
                Mtr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("ypur matrix is: " + Arrays.deepToString(Mtr));
        updateMtr(Mtr);
        System.out.println("your new matrix is: " + Arrays.deepToString(Mtr));



    }
}
