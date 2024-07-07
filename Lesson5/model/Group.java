package model;
import java.util.List;

public class Group {
    private Teacher teacher;
    private List<Student> students;

    public Group(Teacher teacher, List<Student> students){
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents(){
        return students;
    }
}