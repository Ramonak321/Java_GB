import TS.model.Teacher;
import controller.TeacherController;
import java.util.List;

public class main {
    public static void main(String[] args) {
        new TeacherController()
            .sendOnConsole(List.of(new Teacher(1, "Maria", "Ivanova", 2000), new Teacher(1, "Stepan", "Petrov", 2020)));
    }
}
