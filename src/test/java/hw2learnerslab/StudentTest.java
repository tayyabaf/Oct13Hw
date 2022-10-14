package hw2learnerslab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void testImplementation(){
        long id = 4564l;
        String name = "Tayyaba";
        Student student = new Student(id, name, 25.0);
        assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        long id = 4564l;
        String name = "Tayyaba";
        Student student = new Student(id, name, 25.0);
        assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //given
        long id = 4564l;
        String name = "Tayyaba";
        Student student = new Student(id, name, 25.0);
        //when
        student.learn(10.0);
        double actual = student.getTotalStudyTime();
        double expected = 35.00;
        //then
        assertEquals(expected, actual);
    }

}