package ExceptionHandling.ReadPositiveNumber4;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception, PositiveException {
        Scanner scanner = new Scanner(System.in);
        String Url = scanner.next();
        FileInputStream fileInputStream = new FileInputStream(Url);
        System.out.println(fileInputStream.read());
        int i = 0;
        if ((i = fileInputStream.read()) > 0)
            throw new PositiveException(PositiveException.message);
        else {
            System.out.println((char) i);
        }
    }
}
// D:\\JavaCamp\\exception2.txt