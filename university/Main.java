package university;

import university.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Faculty faculty = defineFaculty(scanner);
        System.out.println(faculty.getFields());
        System.out.println(faculty.getName());


        //تعریف دانشکده:
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
                System.out.println("would you like add new Course as PreRequisite? ");
                String select= name.nextLine();
                //اگر کورسی تا الان تعریف نشده بود، پس نام کورس رو بگیر و برو بصورت کورس تعریفش کن و در پیشنیازهاهم قرارش بده
                if (Courses.isEmpty() && Objects.equals(select, "yes")){
                    System.out.println("Please Input Your Course Name as PreRequisite1: ");
                    String CoursePreReqName = name.nextLine();
                    if (CoursePreReqName.equalsIgnoreCase("exit")) {
                        break;
                    }
                    Course newPreReqCourse = new Course(CourseName);
                    System.out.println("Your new Course as PreRequisite add to list of Courses and this is: " + newPreReqCourse.toString());



                } else //اما اگر پیشنیاز قبلا به عنوان کورس تعریف شده بود پس لیست کورس هارو بگیر و یکیش رو انتخاب کن و در پیشنیاز قرار بده
                {
                    System.out.println("Select a course to add prerequisites (input the index): ");
                    int CourseIndex= name.nextInt();
                    name.nextLine();
                    Course SelectedCourse= Courses.get(CourseIndex);

                    System.out.print("Select prerequisite course (input the index): ");
                    int prerequisiteIndex = name.nextInt();
                    name.nextLine();
                    Course prerequisiteCourse = Courses.get(prerequisiteIndex);

                    SelectedCourse.addPrerequisite(prerequisiteCourse);

                    if (prerequisiteCourse.toString().equalsIgnoreCase("exit")) {
                        break;
                    }
                    PreRequisitList.add(prerequisiteCourse);
                }


            }


            Course newCourse = new Course(CourseName, PreRequisitList);
            System.out.println(newCourse.toString());
            CourseList.add(newCourse);
            System.out.println("your course is created and this is: " + newCourse.getName());
        }
        return CourseList;
    }



    private static void exportStudents(University university) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\test111111\\students.txt"))){
            String exportData = "";
            for(Student student : university.getStudents()) {
                String studentString = student.toString() + "\n";
                exportData += studentString;
            }
            exportData = exportData.substring(0, exportData.length() - 1);
            writer.write(exportData);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void loadStudentsFromFile(University university) {
        File studentsFile = new File("D:\\test111111\\students.txt");
        try {
            try (Scanner scanner = new Scanner(studentsFile)) {
                while (scanner.hasNextLine()) {
                    String studentString = scanner.nextLine();
                    String firstname = studentString.split("#")[0];
                    String lastname = studentString.split("#")[1];
                    String nationalCode = studentString.split("#")[2];
                    String entranceYear = studentString.split("#")[3];
                    Student student = new Student(firstname, lastname, nationalCode, entranceYear);
                    university.getStudents().add(student);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void removeStudentWithException(Scanner scanner, University university) {
        while(true) {
            try {
                removeStudentByNationalCode(scanner, university);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void removeStudentByNationalCode(Scanner scanner, University university) throws Exception {
        System.out.println("Enter national code to remove:");
        String nationalCode = scanner.nextLine();

        boolean hasFound = false;

        for (Student student : university.getStudents()) {
            if (student.getNationalCode().equals(nationalCode)) {
                hasFound = true;
                university.getStudents().remove(student);
                break;
            }
        }


}