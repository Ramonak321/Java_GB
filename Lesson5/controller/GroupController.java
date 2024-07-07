package controller;

import java.util.List;
import model.Group;
import service.GroupService;

public class GroupController {
    public Group createGroup(Teacher teacher, List<Student> students){
        GroupService groupService = new GroupService();
        Group group = groupService.createGroup(teacher, students);
        return group;
    }
}
