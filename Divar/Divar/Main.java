package Divar.Divar;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static Divar.Divar.MaxGifts.MaxGiftsList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = getBudget(scanner);
        int[] Options = {10, 25, 4, 7, 3, 11, 56};
        List<Integer> GiftPrice = MaxGiftsList(Options, budget);
        System.out.println(GiftPrice);

    }

    private static int getBudget(Scanner scanner) {
        int budget;
        while (true) {
            System.out.println("Please get your budget: ");
            try {
                budget = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please Enter a Correct Amount of your Budget: ");
                scanner.next();
            }
        }
        return budget;
    }
}
