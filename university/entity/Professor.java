package university.entity;

import java.util.List;

public class Professor extends Person {
    private String professorId;
    private Level level;
    private List<Course> courseList;

    public Professor(String firstName, String lastName, String nationalCode, String entranceYear, String professorId, Level level, List<Course> courseList) {
        super(firstName, lastName, nationalCode, entranceYear);
        this.professorId = professorId;
        this.level = level;
        this.courseList = courseList;
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
}
