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
        teacher.lecture(students.studentsArray, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        for (Instructor x : instructors.instructorsArray){
            if (x.getID() == id){
                x.lecture(students.studentsArray, numberOfHours);
            }
        }
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();
        for(Student x : students.studentsArray){
            studyMap.put(x, x.getTotalStudyTime());
        }
        return studyMap;
    }
}
