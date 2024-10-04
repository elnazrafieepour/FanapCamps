package university.entity;

import java.util.*;

public class Student extends Person {
    private String studentId;
    private Field field;
    private Faculty faculty;
    private List<Course> courseList = new ArrayList<>();
    private Map<Course, Grade> gradeMap;

    public Student(String firstName, String lastName, String nationalCode, String entranceYear, String studentId, Field field, Faculty faculty, List<Course> courseList, Map<Course, Grade> gradeMap) {
        super(firstName, lastName, nationalCode, entranceYear);
        this.studentId = studentId;
        this.field = field;
        this.faculty = faculty;
        this.courseList = courseList;
        this.gradeMap = gradeMap;
    }

    public Student(String firstName, String lastName, String nationalCode, String entranceYear, String studentId, Field field, Faculty faculty) {
        super(firstName, lastName, nationalCode, entranceYear);
        this.studentId = studentId;
        this.field = field;
        this.faculty = faculty;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Map<Course, Grade> getGradeMap() {
        return gradeMap;
    }

    public void setGradeMap(Map<Course, Grade> gradeMap) {
        this.gradeMap = gradeMap;
    }

    //Update Field of Student:
    public static Student updateField(Student student, Field newField) {
        student.setField(newField);
        return student;
    }

    //Add Course List to Student:
    public static List<Course> AddCourseToStudent(Student student, Course course) {
        List<Course> courseList = student.getCourseList();
        courseList.add(course);
        return student.getCourseList();
    }

    //Delete from Course List to Student:
    public static List<Course> DeleteCourseToStudent(Student student, Course course) {
        List<Course> courseList = student.getCourseList();
        courseList.remove(course);
        return student.getCourseList();
    }

    //Add Score to Course of Student:
    public static Map<Course, Grade> DefineScore(Course course, Grade grade) {
        Map<Course, Grade> courseGradeMap = new HashMap<>();
        courseGradeMap.put(course, grade);
        return courseGradeMap;
    }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //Update Field of Student:
        Student student = new Student("eli", "rp", "1757070265", "1390", "9060031007", new Field("math"), new Faculty("Science"));
        Student student2 = new Student("eli2", "rp2", "1757070265", "1390", "9060031007", new Field("math"), new Faculty("Science"));
        System.out.println(updateField(student, new Field("Physics")));
        System.out.println(student2);

        //AddCourseToStudent:
        Course c1 = new Course("ccccccc");
        Course c2 = new Course("ccccccc2");
        Course c3 = new Course("ccccccc3");
        System.out.println(AddCourseToStudent(student, c1));
        System.out.println(AddCourseToStudent(student, c2));
        System.out.println(AddCourseToStudent(student, c3));

        //Delete from Course List to Student:
        System.out.println("the Course is Deleted and the new courseList is: " + DeleteCourseToStudent(student, c1));

        //Add Score to Course for Student:
        System.out.println("please Input Your Index Course to Add Grade: ");
        int courseIndx= scanner.nextInt();
        System.out.println("the score is added to course of Student and this is: " + DefineScore(student.getCourseList().get(courseIndx), Grade.A));


    }

    @Override
    public String toString() {
        return "Student Name: " + this.getFirstName() + ", StudentId: " + this.studentId + ", Field: " + this.field.getName();
    }
}
