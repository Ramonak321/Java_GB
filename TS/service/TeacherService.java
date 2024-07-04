package service;

import TS.model.Teacher;
import java.util.Calendar;

public class TeacherService {

    public Teacher createTeacher(int id, String name, String lastName, int workDate){
        int Year;
        int workTime;
        Year = Calendar.get(Calendar.YEAR);
        workTime = Year - workDate;
        return new Teacher(id, name, lastName, workTime);
    }
}
