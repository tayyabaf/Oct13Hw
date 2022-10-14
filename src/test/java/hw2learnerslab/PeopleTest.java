package hw2learnerslab;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {
    @Test
    public void testAdd() {
        //given
        People people = new People();
        people.setPersonList(new ArrayList<>());
        //when
        people.add(new Person(55l, "Tayyaba"));
        //then
        assertFalse(people.getPersonList().isEmpty());
    }

    @Test
    public void testRemove() {
        //given
        People people = new People();
        people.setPersonList(new ArrayList<>());
        Person person = new Person(55l, "Tayyaba");
        people.add(person);
        //when
        people.remove(person);
        //then
        assertTrue(people.getPersonList().isEmpty());
    }

    @Test
    public void testFindById(){
        //given
        People people = new People();
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(23l, "susan"));
        personList.add(new Person(49l, "Blanco"));
        personList.add(new Person(87l, "Hasan"));
        people.setPersonList(personList);
        //when
        Person expected = personList.get(1);
        Person actual = people.findById(49l);
        //then
        assertEquals(expected, actual);

    }
}