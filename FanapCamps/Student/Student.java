package FanapCamps.Student;

public class Student {
    private long studentId;
    private String name;

    //Constructor:
    public Student(long studentId, String name){
        this.studentId= studentId;
        this.name= name;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getGrade() {
        return name;
    }

    public void setGrade(int grade) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + studentId + ", name='" + name + "'}";
    }
}


