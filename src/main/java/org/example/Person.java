package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name, profession;
    private int age;

    public Person(String name, String profession, int age) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Person> createPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Антон", "Программист", 24));
        persons.add(new Person("Катя", "Аналитик", 27));
        persons.add(new Person("Иван", "Программист", 16));
        persons.add(new Person("Жора", "Кассир", 27));
        return persons;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }
}
