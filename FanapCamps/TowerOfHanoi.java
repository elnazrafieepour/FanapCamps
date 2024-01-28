package FanapCamps;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int inputNum= input.nextInt();
        System.out.println("Moves for Tower of Hanoi with " + inputNum + " disks:");
        char sourceRod = 'A';
        char auxiliaryRod = 'B';
        char destinationRod = 'C';

        input.close();


        solveTowerOfHanoi(inputNum, sourceRod, auxiliaryRod, destinationRod);
    }

    public static void solveTowerOfHanoi(int n, char sourceRod, char auxiliaryRod, char destinationRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + sourceRod + " to " + destinationRod);
            return;
        }

        solveTowerOfHanoi(n - 1, sourceRod, destinationRod, auxiliaryRod);
        System.out.println("Move disk " + n + " from " + sourceRod + " to " + destinationRod);
        solveTowerOfHanoi(n - 1, auxiliaryRod, sourceRod, destinationRod);
    }
}