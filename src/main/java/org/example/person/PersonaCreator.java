package org.example.person;

import java.util.Random;

public class PersonaCreator {
    private static final int MIN_AGE = 15;
    private static final int MAX_AGE = 30;

    private static final Random RANDOM = new Random();
    private static final Name[] NAMES = Name.values();
    private static final Surname[] SURNAMES = Surname.values();

    public static Name createName() {
        return NAMES[RANDOM.nextInt(NAMES.length)];
    }

    public static Surname createSurname() {
        return SURNAMES[RANDOM.nextInt(SURNAMES.length)];
    }
    public static int createAge() {
        return RANDOM.nextInt(MAX_AGE - MIN_AGE) + MIN_AGE;
    }
    public static Person createPerson() {
        return new Person(createName(), createSurname(), createAge());
    }
}
