package hw2learnerslab;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {
    @Test
    public void test(){
        //given
        Students students = Students.getInstance();
        //when
        //then
        for (Student x : students.studentsArray){
            assertTrue(x.getID() == 23l || x.getID() ==45l || x.getID() ==39l);
        }
    }



}