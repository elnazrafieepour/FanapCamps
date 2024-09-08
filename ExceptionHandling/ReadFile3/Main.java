package ExceptionHandling.ReadFile3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String Url = scanner.next();
        try {
            CheckFile(Url);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void CheckFile(String url) throws FileNotFoundException {
        File file = new File(url);
        Scanner scanner = new Scanner(file);
        while (!scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}
