package ExceptionHandling.DuplicateNumber6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws DuplicateNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please inter the size of array: ");
        /*
        //اگر بخوام خطای ورودی غیرعددی را برای سایز آرایه بگیرم اونوقت پارامترهای size و array2 از اسکوپ تعریف شده خارج می شوند. آیا تمام فرایند تعریف آرایه را لازم است در بلاک try قرار دهیم؟
        while (true) {
            try {
                int size = scanner.nextInt();
                int[] array2 = new int[size];
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
*/
        int size = scanner.nextInt();
        int[] array2 = new int[size];
        for (int i = 0; i < size; ) {
            System.out.println("Please inter the Number " + i + " of array: ");
            int input = scanner.nextInt();
            try {
                validateInput(array2, input);
                array2[i] = input;
                i++;
            } catch (DuplicateNumberException e) {
                System.out.println(e.getMessage());
            }

        }
        scanner.close();
        System.out.println(Arrays.toString(array2));
    }

    public static void validateInput(int[] array2, int Number) throws DuplicateNumberException {
        for (int num : array2) {
            if (num == Number) {
                throw new DuplicateNumberException(DuplicateNumberException.Message);
            }
        }
    }

}