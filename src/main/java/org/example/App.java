package org.example;

import org.example.controller.FileObjectReader;
import org.example.controller.FileObjectWriter;
import org.example.controller.Printer;
import org.example.controller.TextDataList;
import org.example.person.PersonGenerator;
import org.example.sort.AgeSorter;
import org.example.sort.MyComparator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        PersonGenerator personGenerator = new PersonGenerator();
        personGenerator.generatePersona();
        Printer.printList(AgeSorter.getPersonUnderLegalAge(PersonGenerator.getPersonList()));
        MyComparator.getSortList(AgeSorter.getPersonUnderLegalAge(PersonGenerator.getPersonList()));
        MyComparator.getSetList(MyComparator.SORT_LIST);
        FileObjectWriter.writeToFile(MyComparator.SET_LIST);
        FileObjectReader.readFromFile();
        TextDataList.setTextDataList(FileObjectReader.readFromFile());
        Printer.printList(TextDataList.DATA_FROM_FILE);

    }
}
