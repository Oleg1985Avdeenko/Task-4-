package org.example.sort;

import org.example.person.Person;
import org.example.person.PersonGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AgeSorterTest {
    private static final int LEGAL_AGE = 21;

    @Test
    public void testGetPersonUnderLegalAge() {
        List<Person> persons = PersonGenerator.getPersonList();
        for (Person person : persons) {
            if (person.getAge() > LEGAL_AGE) {
                Assertions.fail();
            }
        }


    }
}
