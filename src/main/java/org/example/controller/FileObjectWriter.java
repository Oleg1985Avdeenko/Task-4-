package org.example.controller;

import org.example.person.Person;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;


public class FileObjectWriter {
    public static final String DATA = "DataFile.txt";

    public static void writeToFile(List<Person> personList) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(DATA))) {
            for (Person person : personList) {
                objectOutputStream.writeObject(person);
            }
            System.out.println("File has been written");
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

    }
}
