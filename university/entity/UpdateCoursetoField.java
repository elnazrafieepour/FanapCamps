package university.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static university.entity.EntityList.*;

public class UpdateCoursetoField {

    public static void main(String[] args) {
        List<Course> CourseList1 = new ArrayList<>();
        List<Course> CourseList2 = new ArrayList<>();
        Course c1 = new Course("c1");
        Course c2 = new Course("c2");
        Course c3 = new Course("c3");
        CourseList1.add(c1);
        CourseList1.add(c2);
        CourseList1.add(c3);
        CourseList2.add(c1);
        CourseList2.add(c3);

        Field field1 = new Field("math", CourseList1);
        Field field2 = new Field("physics", CourseList2);
        List<Field> Fields = new ArrayList<>();
        Fields.add(field1);
        Fields.add(field2);
        System.out.println(Fields.toString());

        System.out.println(field1.getCourseList());
        System.out.println(field2.getCourseList());


        Scanner scanner = new Scanner(System.in);


        System.out.println(Fields);
        System.out.print("Select Your Field (input the index): ");
        int FieldIndex = scanner.nextInt();
        scanner.nextLine();
        Field YourField = Fields.get(FieldIndex);
        System.out.println("your selected Field is: " + YourField.getName());

        List<Course> Courses = getListOfCourse(YourField);
        System.out.println("the list of course is: " + getListOfCourse(YourField));

        //Update Course of Field:
        YourField.updateCourse("c1", "d1");

        //Add & Delete Course from List:
        addCourseUpdate(scanner, YourField);
        DeleteCourseUpdate(scanner, YourField);

    }

    private static void addCourseUpdate(Scanner scanner, Field YourField) {
        System.out.println("Please Input Your New Course: ");
        String CourseName = scanner.nextLine();
        Course newCourse = new Course(CourseName);
        List<Course> Courses = YourField.getCourseList();
        Courses.add(newCourse);
        System.out.println("the new list of Course is: " + getListOfCourse(YourField));
    }

    private static void DeleteCourseUpdate(Scanner scanner, Field YourField) {
        System.out.println("the list of Course is: " + getListOfCourse(YourField));
        System.out.print("Select Your Course to Delete (input the index): ");
        int CourseIndex = scanner.nextInt();
        scanner.nextLine();
        System.out.println("your selected Course to Delete is: " + getListOfCourse(YourField).get(CourseIndex).getName());
        getListOfCourse(YourField).remove(CourseIndex);
        System.out.println("the new list of Course is After Delete Course: " + getListOfCourse(YourField));
    }

}
