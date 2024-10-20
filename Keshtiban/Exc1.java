package Keshtiban;

import java.util.Arrays;
import java.util.Scanner;

public class Exc1 {
    public static int[][] updateMtr(int[][] mtr) {
        int size = mtr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int neighbor = countOfLifes(mtr, i, j);

                if (mtr[i][j] == 1) {
                    if (neighbor < 2 || neighbor > 3) {
                        mtr[i][j] = 0;
                    } else {
                        mtr[i][j] = 1;
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
        return mtr;
    }

    public static int countOfLifes(int[][] mtr, int x, int y) {
        int lifeCount = 0;
        int size = mtr.length;
        int[] directions = {1, 0, -1};
        for (int i : directions) {
            for (int j : directions) {
                if (i == 0 && j == 0) {
                    continue;
                }
                int newX = x + i;
                int newY = y + j;
                if (newX >= 0 && newX < size && newY >= 0 && newY < size) {
                    lifeCount += mtr[newX][newY];
                }
            }
        }
        return lifeCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input the size of Matrix: ");
        int input = scanner.nextInt();
        System.out.println("Please Input data for Matrix: ");
        int[][] Mtr = new int[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                Mtr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("ypur matrix is: " + Arrays.deepToString(Mtr));
        updateMtr(Mtr);
        System.out.println("your new matrix is: " + Arrays.deepToString(Mtr));
        scanner.close();

    }
}
