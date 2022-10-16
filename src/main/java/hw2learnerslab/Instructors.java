package hw2learnerslab;

import java.util.ArrayList;
import java.util.List;

public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();
    public final Instructor[] instructorsArray;

    private Instructors(){
        Instructor[] instructors = {new Instructor(99L, "Peter"), (new Instructor(65L, "Mikaila")) };
        this.instructorsArray = instructors;
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
