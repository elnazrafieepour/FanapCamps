package ExceptionHandling.ReadFile5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, EmptyFileReadException {
        Scanner scanner = new Scanner(System.in);
        String Url = scanner.next();
        checkNotNullFile(Url);

        // D:\\JavaCamp\\exception2.txt

    }

    public static void checkNotNullFile(String url) throws EmptyFileReadException, FileNotFoundException {
        try {

            FileInputStream fileInputStream = new FileInputStream(url);
            if (fileInputStream.read() == -1)
                throw new EmptyFileReadException(EmptyFileReadException.massage);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
