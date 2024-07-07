package service;
import model.Group;
import java.util.List;

public class GroupService {
    public Group createGroup(Teacher teacher, List<Student> students){
        Group group = new Group(teacher, students);
        return group;
    }
}
