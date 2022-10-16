package hw2learnerslab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipCodeWilmingtonTest {
    @Test
    void testHostLectureWithTeacherParameter(){
        //given
        ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
        Instructor instructor = cohort.getInstructors().instructorsArray[0];
        //when
        cohort.hostLecture(instructor, 30.0);
        //then
        for (Student x : cohort.getStudents().studentsArray){
            assertTrue(x.getTotalStudyTime() == 30.00 || x.getTotalStudyTime() == 25.5 || x.getTotalStudyTime() == 19.5);
        }
    }

    @Test
    void testHostLectureWithIDParamter(){
        //given
        ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
        //when
        cohort.hostLecture(65L, 30.0);
        //then
        for (Student x : cohort.getStudents().studentsArray){
            assertTrue(x.getTotalStudyTime() == 30.00 || x.getTotalStudyTime() == 25.5 || x.getTotalStudyTime() == 19.5);
        }
    }



}