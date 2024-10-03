package university.entity;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private String name;
    private List<Course> courseList;


    public Field(String name, List<Course> courseList) {
        this.name = name;
        this.courseList = courseList;
    }
    public Field(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    static List<Course> Courses = new ArrayList<>();

    public List<Course> updateCourse(String oldCourseName, String newCourseName) {
        for (Course course : courseList) {
            if (course.getName().equalsIgnoreCase(oldCourseName)) {
                course.setName(newCourseName);
                System.out.println(courseList.toString());
            }
        }
        return courseList;
    }

    @Override
    public String toString() {
        return "Field Name: " + name + ", CourseList: " + courseList;
    }
}
