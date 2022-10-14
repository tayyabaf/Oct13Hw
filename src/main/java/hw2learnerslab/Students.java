package hw2learnerslab;

import java.util.ArrayList;
import java.util.List;

public class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students() {
        Student student1 = new Student(23l, "May", 20.0);
        Student student2 = new Student(45l, "El", 15.5);
        Student student3 = new Student(39l, "Farooq", 9.5);
        Student [] studentsArray = {student1, student2, student3};
        INSTANCE.setStudents(studentsArray);
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
