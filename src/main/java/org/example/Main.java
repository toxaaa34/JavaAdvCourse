package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<Person> persons;
//
//        persons = Person.createPersons();
//
////        List<Person> filterPersons = persons.stream().filter(p -> p.getAge() > 18).filter(p -> !p.getProfession().equals("Программист")).toList();
////        filterPersons.forEach(System.out::println);
//
//        Optional<Person> oldAge = persons.stream().distinct().max(Comparator.comparingInt(Person::getAge));
//        persons.stream().distinct().filter(p -> p.getAge() == oldAge.get().getAge()).forEach(p -> System.out.println(p.getProfession()));


        // первое задание
        List<Rectangle> figures = new ArrayList<>();
        figures.add(new Rectangle(4,3));
        figures.add(new Rectangle(4,3));
        figures.add(new Rectangle(3,4));
        figures.add(new Rectangle(10,5));
        figures.add(new Rectangle(6,6));
        figures.add(new Rectangle(7,3));
        figures.add(new Rectangle(3,7));

        List<Rectangle> uniqueFigures = figures.stream().distinct().toList();
        System.out.println(uniqueFigures.stream().count());

        System.out.println(uniqueFigures.stream().mapToInt(Rectangle::getArea).sum());

        // второе задание

        List<Planet> planets = Arrays.asList(
                new Planet("Меркурий", 3.302e23, List.of()),
                new Planet("Венера", 4.867e24, List.of()),
                new Planet("Земля", 5.972e24, List.of(
                        new Satellite("Луна", 7.348e22, "серый")
                )),
                new Planet("Марс", 6.417e23, List.of(
                        new Satellite("Фобос", 1.072e16, "красный"),
                        new Satellite("Деймос", 1.476e15, "красный")
                )),
                new Planet("Юпитер", 1.899e27, List.of(
                        new Satellite("Ио", 8.94e22, "желтый"),
                        new Satellite("Европа", 4.8e22, "белый"),
                        new Satellite("Ганимед", 1.482e23, "белый"),
                        new Satellite("Каллисто", 1.076e23, "коричневый")
                )),
                new Planet("Сатурн", 5.685e26, List.of(
                        new Satellite("Титан", 1.345e23, "оранжевый"),
                        new Satellite("Рея", 2.307e21, "серый"),
                        new Satellite("Япет", 1.806e21, "черно-белый")
                )),
                new Planet("Уран", 8.683e25, List.of(
                        new Satellite("Титания", 3.53e21, "серый"),
                        new Satellite("Оберон", 3.02e21, "серый"),
                        new Satellite("Умбриэль", 1.17e21, "серый"),
                        new Satellite("Ариэль", 1.35e21, "серый")
                )),
                new Planet("Нептун", 1.024e26, List.of(
                        new Satellite("Тритон", 2.14e22, "розовый"),
                        new Satellite("Протей", 5.0e21, "серый")
                ))
        );

        // Вывод списка названий планет по убыванию массы
        System.out.println("Планеты по убыванию массы:");
        planets.stream()
                .sorted(Comparator.comparingDouble(Planet::getMass).reversed())
                .map(Planet::getName)
                .forEach(System.out::println);

        // Вывод списка названий планет по возрастанию суммарной массы спутников
        System.out.println("\nПланеты по возрастанию суммарной массы спутников:");
        planets.stream()
                .sorted(Comparator.comparingDouble(p -> p.getSatellites().stream().mapToDouble(Satellite::getMass).sum()))
                .map(Planet::getName)
                .forEach(System.out::println);

        // Вывод списка названий всех спутников по возрастанию массы
        System.out.println("\nВсе спутники по возрастанию массы:");
        planets.stream()
                .flatMap(p -> p.getSatellites().stream())
                .sorted(Comparator.comparingDouble(Satellite::getMass))
                .map(Satellite::getName)
                .forEach(System.out::println);
    }
}