package ExceptionHandling;

import java.util.Scanner;

public class Main {
    private static int nationalCodeDigitCount = 10;
    public static void main(String[] args) throws FirstNameException {
        Scanner scanner = new Scanner(System.in);
        String firstName = getFirstName(scanner);
        String lastName = getLastName(scanner);
        String nationalCode = getNationalCode(scanner);
//
        Person person = new Person(firstName, lastName, nationalCode);
        System.out.println(person);
    }

    private static String getNationalCode(Scanner scanner) {
        String nationalCode;
        while (true) {
            System.out.println("Enter national code: ");
            nationalCode = scanner.nextLine();
            try {
                validateNationalCode(nationalCode);
                break;
            } catch (NationalCodeException e) {
                System.out.println(e.getMessage());
            }
        }

        return nationalCode;
    }

    private static void validateNationalCode(String nationalCode) throws NationalCodeException {
        if (nationalCode == null || nationalCode.trim().equals(""))
            throw new NationalCodeException(NationalCodeException.mandatoryMessage);

        if (nationalCode.length() != nationalCodeDigitCount)
            throw new NationalCodeException(NationalCodeException.nationalCodeLengthMessage);

        if (!nationalCode.matches("\\d+"))
            throw new NationalCodeException(NationalCodeException.nationalCodeDigitException);
    }

    private static String getFirstName(Scanner scanner) {
        String firstName;
        while (true) {
            System.out.println("Enter firstName: ");
            firstName = scanner.nextLine();
            try {
                validateFirstName(firstName);
                break;
            } catch (FirstNameException e) {
                System.out.println(e.getMessage());
            }
        }

        return firstName;
    }

    private static String getLastName(Scanner scanner) {
        String lastName;
        while (true) {
            System.out.println("Enter lastName: ");
            lastName = scanner.nextLine();
            try {
                validateLastName(lastName);
                break;
            } catch (LastNameException e) {
                System.out.println(e.getMessage());
            }
        }

        return lastName;
    }

    public static void validateFirstName(String firstName) throws FirstNameException {
        if (firstName == null || firstName.trim().equals("")) {
            throw new FirstNameException(FirstNameException.message);
        }
    }

    public static void validateLastName(String lastName) throws LastNameException {
        if (lastName == null || lastName.trim().equals("")) {
            throw new LastNameException(FirstNameException.message);
        }
    }

}
