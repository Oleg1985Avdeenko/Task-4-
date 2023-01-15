package org.example.person;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private Name name;
    private Surname surname;
    private int age;

    public Person(Name name, Surname surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Surname getSurname() {
        return surname;
    }

    public void setSurname(Surname surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                " name: " + name +
                ", surname: " + surname +
                ", age: " + age +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getName() == person.getName() && getSurname() == person.getSurname();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge());
    }
}
