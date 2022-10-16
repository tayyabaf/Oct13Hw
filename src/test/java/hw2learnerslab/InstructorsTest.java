package hw2learnerslab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorsTest {
    @Test
    public void test(){
        //given
        Instructors instructors = Instructors.getInstance();
        //when
        //then
        for (Instructor x : instructors.instructorsArray){
            assertTrue(x.getID()==99L || x.getID() ==65L);
        }
    }

}