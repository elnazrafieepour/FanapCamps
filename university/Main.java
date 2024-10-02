package university;

import university.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Faculty faculty = defineFaculty(scanner);

       // University university = defineUniversity(scanner);

    }
/*
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
    //private static List<String> CourseList= new ArrayList<>();

 */

    private static Faculty defineFaculty(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Please Enter Your Faculty Name: ");
                String FacultyName = scanner.nextLine();
                if (FacultyName.trim().equals("")) {
                    throw new Exception("Invalid Faculty Name");
                }
                List<Field> FieldListFaculty= CreateFieldList(scanner);


                Faculty facultyName = new Faculty(FacultyName, FieldListFaculty);
                return facultyName;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private static List<Field> CreateFieldList(Scanner input){
        List<Field> FieldList= new ArrayList<>();

        while (true){

            System.out.println("Please enter your Field: ");
            String Field= input.nextLine();

            if (Field.equalsIgnoreCase("exit")){
                break;
            }

            List<Course> CourseList= CreateCourseList(input);
            Field newField= new Field(Field, CourseList);
            FieldList.add(newField);
        }
        //System.out.println("your Course List is: " + CourseList.toString());
        return FieldList;

    }
/*
    private static Field CreateField(String Field1, Scanner scanner){
        //String nameField= scanner.nextLine();
       // List<Course> CourseList= new ArrayList<>();
/*
        while (true){

           // String Course= scanner.next();
            System.out.println("your enter your Course: ");

            if (Course.equalsIgnoreCase("exit")){
                break;
            }

        System.out.println("Please Input PreRequisit Course for this Course: ");
        String prerequisiteName=scanner.nextLine();

        List<Course> course1= CreateCourse(Field1, prerequisiteName);
       // CourseList.add(course1);
            Field newField= new Field(Field1, course1);

        //System.out.println("your Course List is: " + CourseList.toString());
        return newField;
    }

    */
     private static List<Course> CreateCourseList(Scanner name){
         System.out.println("Please Input Your Course NAme: ");
         String CourseName= name.nextLine();
         List<Course> CourseList= new ArrayList<>();
         List<String> PreRequisitList= new ArrayList<>();

         while (true){

             String prereq= name.next();
             System.out.println("your enter your preRequisit: ");

             if (prereq.equalsIgnoreCase("exit")){
                 break;
             }


             PreRequisitList.add(prereq);
         }



         Course newCourse=new Course(CourseName, PreRequisitList);
         System.out.println("your course is created and this is: " + newCourse.getName());
         CourseList.add(newCourse);
         System.out.println(CourseList);
        return CourseList;
     }

}