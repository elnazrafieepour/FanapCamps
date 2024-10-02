package university;

import university.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Faculty faculty = defineFaculty(scanner);
        System.out.println(faculty.getFields());
        System.out.println(faculty.getName());

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
                List<Field> FieldListFaculty = CreateFieldList(scanner);


                Faculty facultyName = new Faculty(FacultyName, FieldListFaculty);
                System.out.println(facultyName);
                return facultyName;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static List<Field> CreateFieldList(Scanner input) {
        List<Field> FieldList = new ArrayList<>();

        while (true) {
            System.out.println("Please enter your Field: ");
            String Field = input.nextLine();
            if (Field.equalsIgnoreCase("exit")) {
                break;
            }
            List<Course> CourseList = CreateCourseList(input);
            Field newField = new Field(Field, CourseList);
            FieldList.add(newField);
        }
        System.out.println("your FieldList is: " + FieldList.toString());
        return FieldList;

    }

    private static List<Course> CreateCourseList(Scanner name) {
        List<Course> CourseList = new ArrayList<>();
        List<Course> PreRequisitList = new ArrayList<>();
        while (true) {
            System.out.println("Please Input Your Course Name: ");
            String CourseName = name.nextLine();
            if (CourseName.equalsIgnoreCase("exit")) {
                break;
            }

            while (true) {
                List<Course> Courses= Course.getCourseList();
                System.out.println("Select a course to add prerequisites (input the index): ");
                int CourseIndex= name.nextInt();
                Course SelectedCourse= Courses.get(CourseIndex);

                System.out.print("Select prerequisite course (input the index): ");
                int prerequisiteIndex = name.nextInt();
                Course prerequisiteCourse = Courses.get(prerequisiteIndex);

                SelectedCourse.addPrerequisite(prerequisiteCourse);
/*
                System.out.println("your enter your preRequisit: ");
                Course prereq = name.nextLine();

 */
                if (prerequisiteCourse.toString().equalsIgnoreCase("exit")) {
                    break;
                }
                PreRequisitList.add(prerequisiteCourse);
            }


            Course newCourse = new Course(CourseName, PreRequisitList);
            System.out.println(newCourse.toString());
            CourseList.add(newCourse);
            System.out.println("your course is created and this is: " + newCourse.getName());
        }
        return CourseList;
    }

}