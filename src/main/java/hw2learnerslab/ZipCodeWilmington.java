package hw2learnerslab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private final Students students;
    private final Instructors instructors;

    private ZipCodeWilmington(){
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public Students getStudents() {
        return students;
    }


    public Instructors getInstructors() {
        return instructors;
    }


    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getStudents(), 25.0);
    }

    public void hostLecture(long id, double numberOfHours){
        for (Instructor x : instructors.getInstructors()){
            if (x.getID() == id){
                x.lecture(students.getStudents(), 35.5);
            }
        }
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();
        for(Student x : students.getStudents()){
            studyMap.put(x, x.getTotalStudyTime());
        }
        return studyMap;
    }
}
