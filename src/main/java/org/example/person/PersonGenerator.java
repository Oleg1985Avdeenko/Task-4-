package org.example.person;

import java.util.ArrayList;
import java.util.List;

public class PersonGenerator {
    private static final int NUMBER_OF_PERSONS = 100;

    public static List<Person> personList = new ArrayList<>();

    public static List<Person> getPersonList() {
        return personList;
    }

    public void generatePersona() {
        for (int i = 0; i < NUMBER_OF_PERSONS; i++) {
            personList.add(PersonaCreator.createPerson());
        }
    }
}
