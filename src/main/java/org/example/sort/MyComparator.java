package org.example.sort;

import org.example.person.Person;
import org.example.person.PersonGenerator;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyComparator {

    public static final List<Person> SORT_LIST = getSortList(
            AgeSorter.getPersonUnderLegalAge(PersonGenerator.getPersonList()));

    public static final List<Person> SET_LIST = getSetList(MyComparator.getSortList(
            AgeSorter.getPersonUnderLegalAge(PersonGenerator.getPersonList())));


    public static List<Person> getSortList(List<Person> personList) {
        personList.sort(Comparator.comparing(Person::getSurname)
                        .thenComparing(Person::getName));
        return personList;
    }
    public static List<Person> getSetList(List<Person> personList) {
        return personList.stream().distinct().collect(Collectors.toList());
    }
}
