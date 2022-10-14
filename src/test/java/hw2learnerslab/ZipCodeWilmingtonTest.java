package hw2learnerslab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipCodeWilmingtonTest {
    @Test
    void testHostLectureWithTeacherParameter(){
        //given
        ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
        Instructor instructor = new Instructor(23L, "Peter");
        //when
        cohort.hostLecture(instructor, 30.0);
        //then
        for (Student x : cohort.getStudents().getStudents()){
            assertTrue(x.getTotalStudyTime() == 30.0 || x.getTotalStudyTime() ==25.5 || x.getTotalStudyTime() ==19.5);
        }
    }

//finish over weekend

}