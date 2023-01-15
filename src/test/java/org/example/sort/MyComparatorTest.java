package org.example.sort;

import junit.framework.TestCase;
import org.example.person.Name;
import org.example.person.Person;
import org.example.person.PersonGenerator;
import org.example.person.Surname;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparatorTest extends TestCase {

    public void testGetSortList() {
        PersonGenerator personGenerator = new PersonGenerator();
        personGenerator.generatePersona();
        List<Person> personList = MyComparator.getSortList(PersonGenerator.getPersonList());
        Person person = personList.get(0);
        Assertions.assertEquals(person.getSurname(), Surname.BERGHOLC);
    }

    public void testGetSetList() {
        List<Person> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, new Person(Name.AYN, Surname.RAND, 20),
                new Person(Name.GEORGE, Surname.ORWELL, 20),
                new Person(Name.ALBERT, Surname.EINSTEIN, 17));
        List<Person> testList = new ArrayList<>();
        Collections.addAll(testList, new Person(Name.AYN, Surname.RAND, 20),
                new Person(Name.AYN, Surname.RAND, 20),
                new Person(Name.GEORGE, Surname.ORWELL, 20),
                new Person(Name.GEORGE, Surname.ORWELL, 20),
                new Person(Name.ALBERT, Surname.EINSTEIN, 17));
        List<Person> actualList = MyComparator.getSetList(testList);
        Assertions.assertEquals(expectedList, actualList);
    }
}