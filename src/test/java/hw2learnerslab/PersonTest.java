package hw2learnerslab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {
@Test
public void testConstructor(){
    //given
    long id = 4564l;
    String name = "Tayyaba";
    //when
    Person person = new Person(id, name);
    //then
    Assertions.assertEquals(id, person.getID());
    Assertions.assertEquals(name, person.getName());
}

@Test
public void testSetName(){
    //given
    long id = 4564l;
    String name = "Tayyaba";
    Person person = new Person(id, name);
    //when
    person.setName("Julie");
    //then
    Assertions.assertEquals("Julie", person.getName());
}

}