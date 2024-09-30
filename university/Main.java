package university;

import university.entity.University;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = defineUniversity(scanner);


    }

    private static University defineUniversity(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Enter university name:");
                String universityName = scanner.nextLine();
                if (universityName.trim().equals("")) {
                    throw new Exception("Invalid name");
                }
                University university = new University(universityName);
                return university;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
