package ExceptionHandling.ReadFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, EmptyFileReadException {
        Scanner scanner= new Scanner(System.in);
        String Url= scanner.next();

            FileInputStream fileInputStream = new FileInputStream(Url);
            if (fileInputStream.read() ==-1)
                throw new EmptyFileReadException(EmptyFileReadException.massage);

       // D:\\JavaCamp\\exception2.txt
    }
}
