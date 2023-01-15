package org.example.sort;

import org.example.person.Person;
import org.example.person.PersonGenerator;

import java.util.ArrayList;
import java.util.List;

public class AgeSorter {

    private static final int LEGAL_AGE = 21;

    public static List<Person> getPersonUnderLegalAge(List<Person> persons) {

        List<Person> personUnderLegalAge = new ArrayList<>();

        for (Person person : persons) {
            if (person.getAge() < LEGAL_AGE) {
                personUnderLegalAge.add(person);
            }
        }
        return personUnderLegalAge;
    }
}
