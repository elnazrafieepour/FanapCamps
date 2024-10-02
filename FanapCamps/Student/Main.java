package FanapCamps.Student;
/*
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    String name;
   /*
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String Url = scanner.next();
        try (FileInputStream br = new FileInputStream(Url)) {
            try (Workbook workbook = new XSSFWorkbook(br)) {
                Sheet sheet = workbook.getSheetAt(0);
                for (Row row : sheet) {
                    String name = row.getCell(0).getStringCellValue();
                    int studentId = (int) row.getCell(1).getNumericCellValue();

                    Student student = new Student(studentId, name);
                    System.out.println(student.toString());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
*/
}
