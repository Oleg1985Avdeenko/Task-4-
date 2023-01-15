package org.example.controller;

import org.example.person.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileObjectReader {

    public static ArrayList<Person> readFromFile() {
        ArrayList<Person> dataFromFile = new ArrayList<>();

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FileObjectWriter.DATA))) {

            while (true) {
                try {
                    dataFromFile.add((Person) objectInputStream.readObject());
                } catch (ClassNotFoundException e) {
                    break;
                }
            }

        } catch (IOException ex) {
            ex.getStackTrace();
        }
        return dataFromFile;
    }
}
