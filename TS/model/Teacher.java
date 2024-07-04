package TS.model;

public class Teacher extends User {

    public Teacher(int id, String name, String lastName, int workTime){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.workTime = workTime;
    }

    @Override
    public String toString(){
        return String.format("Teacher [id=%d, name=%s, lastName=%s, workTime=%d]", id, name, lastName, workTime);
    }
}