package hw1testingpersonclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    public void setAgeTest(){
        //given
        Person person = new Person();
        //when
        person.setAge(10);
        //then
        Assertions.assertEquals(10, person.getAge());
    }

@Test
public void setNameTest(){
    //given
    Person person = new Person();
    //when
    person.setName("Farooq");
    //then
    Assertions.assertEquals("Farooq", person.getName());


}


//recheck this one for age part
    @Test
    public void nullaryConstuctorTest(){
        //given
        //when
        Person person = new Person();
        //then
        Assertions.assertNull(person.getName());
        Assertions.assertEquals(0, person.getAge());

    }

@Test
    public void ageConstructorTest(){
        //given
    int age = 39;
         //when
    Person person = new Person(age);
    //then
    Assertions.assertEquals(age, person.getAge());
}

@Test
    public void nameConstructorTest(){
        //given
    String name = "Tayyaba";
    //when
    Person person = new Person(name);
    //then
    Assertions.assertEquals(name, person.getName());
}

@Test
    public void nameAndAgeConstructorTest(){
        //given
    String name = "Susan";
    int age = 11;
    //when
    Person person = new Person(name, age);
    //then
    Assertions.assertEquals(name, person.getName());
    Assertions.assertEquals(age, person.getAge());
}

}