package TS.controller;

public class TeacherController implements UserController {

    private UserView<Teacher> view = new TeacherView();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Teacher> teachers) {
        view.sendOnConsole(teachers);
    }

}