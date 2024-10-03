package university.entity;

import java.util.ArrayList;
import java.util.List;

public class EntityList {
    public static void main(String[] args) {
        //تعریف دانشجو، استاد و دریافت لیست آن ها:
        EntityList newEntityList = new EntityList();
        newEntityList.addStudent(new Student("eli1", "rafi1", "1234", "1390", "5678", new Field("math"), new Faculty("Science")));
        newEntityList.addStudent(new Student("eli2", "rafi2", "1234", "1390", "5678", new Field("math"), new Faculty("Science")));
        newEntityList.addProfessor(new Professor("ostad1", "aaa", "1111", "2222"));
        newEntityList.addProfessor(new Professor("ostad2", "bbb", "1111", "2222"));

        System.out.println(newEntityList.getListOfStudent().toString());
        System.out.println(newEntityList.getListOfProfessor().toString());

    }

    //دریافت لیست اساتید، دانشجویان و دروس
    static List<Student> Students = new ArrayList<>();
    List<Professor> Professors = new ArrayList<>();
    static List<Course> Courses = new ArrayList<>();
    static List<Field> Fields = new ArrayList<>();


    public void addStudent(Student student) {
        Students.add(student);
    }

    public void addProfessor(Professor professor) {
        Professors.add(professor);
    }

    public void addCourse(Course course) {
        Courses.add(course);
    }

    //آپدیت کورس:
    public void removeCourse(Course course) {
        Courses.remove(course);
    }
    public void removeCourse2(String courseName) {
        Courses.removeIf(course -> course.getName().equalsIgnoreCase(courseName));
    }


    public void addField(Field field) {
        Fields.add(field);
    }
    public static List<Student> getListOfStudent() {
        return Students;
    }

    public List<Professor> getListOfProfessor() {
        return Professors;
    }

    public static List<Course> getListOfCourse(Field field) {
        return field.getCourseList();
    }
    static public List<Field> getListOfField() {
        return Fields;
    }

}
