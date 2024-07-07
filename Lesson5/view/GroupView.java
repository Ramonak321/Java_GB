package view;
import model.Group;
import controller.GroupController;

public class GroupView {
    public void view(Group group){
        System.out.println("Teacher: " + group.getTeacher().getId());
        System.out.println("Students:");
        for (Student student : group.getStudents()){
            System.out.println(student.getId());
        }
    }
}
