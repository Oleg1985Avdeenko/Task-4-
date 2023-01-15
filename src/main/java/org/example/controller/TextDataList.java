package org.example.controller;

import org.example.person.Person;

import java.util.List;

public class TextDataList {

    public static final List<String> DATA_FROM_FILE = setTextDataList(FileObjectReader.readFromFile());

    public static List<String> setTextDataList(List<Person> personList) {
       // List<String> listFromFile =
               return personList.stream().map(e -> " name: " + e.getName()
                + ", surname: " + e.getSurname()).toList();

    }
}
