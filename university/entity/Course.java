package university.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Student> students;
    private Professor professor;
    private List<Course> prerequisite;

    public Course(String name, List<Student> students, Professor professor, List<Course> prerequisite) {
        this.name = name;
        this.students = students;
        this.professor = professor;
        this.prerequisite = prerequisite;
    }
    static List<Course> listcourse= new ArrayList<>();

    public Course(String name, List<Course> prerequisite) {
        this.name = name;
        this.prerequisite = new ArrayList<>(prerequisite);
        listcourse.add(this);
    }

    public Course(String name) {
        this.name = name;
        listcourse.add(this);
    }

    public static List<Course> getCourseList(){
        System.out.println(listcourse.toString());
        return listcourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Course> getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(List<Course> prerequisite) {
        this.prerequisite = prerequisite;
    }

    public void addPrerequisite(Course course) {
        prerequisite.add(course);
    }

    @Override
    public String toString() {
        return "Course Name: " + name + ", Prerequisites: " + prerequisite;
    }
}
