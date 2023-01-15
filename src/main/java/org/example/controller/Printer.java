package org.example.controller;

import java.util.List;

public class Printer {

    public static void printList(List<?> list) {
        list.forEach(System.out::println);
    }
}
