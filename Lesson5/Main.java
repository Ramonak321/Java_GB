import java.util.ArrayList;
import model.Group;
import controller.GroupController;
import view.GroupView;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Maria");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan"));
        students.add(new Student("Petr"));

        GroupController groupController = new GroupController();

        Group group = groupController.createGroup(teacher, students);

        GroupView groupView = new GroupView();
        groupView.view(g);
    }
}
