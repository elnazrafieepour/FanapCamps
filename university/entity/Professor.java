package university.entity;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {
    private String professorId;
    private Level level;
    private List<Course> courseList=new ArrayList<>();

    public Professor(String firstName, String lastName, String nationalCode, String entranceYear, String professorId, Level level, List<Course> courseList) {
        super(firstName, lastName, nationalCode, entranceYear);
        this.professorId = professorId;
        this.level = level;
        this.courseList = courseList;
    }
    public Professor(String firstName, String lastName, String nationalCode, String entranceYear) {
        super(firstName, lastName, nationalCode, entranceYear);
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    //Add Course List to Professor:
    public static List<Course> AddCourseToProfessor(Professor professor, Course course){
        List<Course> courseList= professor.getCourseList();
        courseList.add(course);
        return professor.getCourseList();
    }

    //Delete from Course List to Professor:
    public static List<Course> DeleteCourseToProfessor(Professor professor, Course course){
        List<Course> courseList= professor.getCourseList();
        courseList.remove(course);
        return professor.getCourseList();
    }

    public static void main(String[] args) {
        //Update Field of Student:
        Professor professor = new Professor("pro1", "rp", "1757070265", "1390");
        Professor professor2 = new Professor("pro2", "rp2", "1757070265", "1390");

        //AddCourseToStudent:
        Course c1= new Course("ccccccc");
        Course c2= new Course("ccccccc2");
        Course c3= new Course("ccccccc3");
        System.out.println(AddCourseToProfessor(professor, c1));
        System.out.println(AddCourseToProfessor(professor, c2));
        System.out.println(AddCourseToProfessor(professor, c3));
        System.out.println(AddCourseToProfessor(professor2, c3));

        //Delete from Course List to Student:
        System.out.println("the Course is Deleted and the new courseList is: " + DeleteCourseToProfessor(professor, c1));

    }

    @Override
    public String toString() {
        return "Professor Name: " + this.getFirstName() + ", entranceYear: " + this.getEntranceYear();
    }
}

