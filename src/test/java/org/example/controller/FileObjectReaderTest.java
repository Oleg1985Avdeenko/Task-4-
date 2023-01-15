package org.example.controller;

import junit.framework.TestCase;
import org.example.person.Person;
import org.example.person.PersonGenerator;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileObjectReaderTest extends TestCase {

    public void testReadFromFile() {
        PersonGenerator personGenerator = new PersonGenerator();
        personGenerator.generatePersona();
        List<Person> expectedList = PersonGenerator.getPersonList();
        FileObjectWriter.writeToFile(expectedList);
        List<Person> testList = FileObjectReader.readFromFile();
        Assertions.assertEquals(expectedList, testList);
    }
}