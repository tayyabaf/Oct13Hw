package hw2learnerslab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {

    @Test
    public void testImplementation(){
        long id = 9900l;
        String name = "Peter";
        Instructor instructor = new Instructor(id, name);
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        long id = 9900l;
        String name = "Peter";
        Instructor instructor = new Instructor(id, name);
        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        //given
        Instructor instructor = new Instructor(45l, "Pete");
        Student student = new Student(239l, "Susan", 10.0);
        //when
        instructor.teach(student, 15.0);
        //then
        assertEquals(25.0, student.getTotalStudyTime());
    }

    @Test
    public void testLecture(){
        //given
        Learner[] learners = {new Student(12l, "Ranya", 23.0), new Student(34l, "Jupiter", 12.0), new Student(55l, "Mike", 44.0)};
        Instructor instructor = new Instructor(509l, "Milan");
        //when
        instructor.lecture(learners, 23.5);
        double hoursPerStudent = 23.5/learners.length;
        double[] expected = {(23+hoursPerStudent), (12 + hoursPerStudent), (44 + hoursPerStudent)};
        //then
    for (int i = 0; i < learners.length; i++){
    assertEquals(expected[i], learners[i].getTotalStudyTime());

        }
    }

}