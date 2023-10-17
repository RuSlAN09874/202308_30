package org.example.additionalTask.task23_10_11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.
        m1();
        //Дан список целых чисел. Необходимо найти максимальный
        //элемент списка, который делится на заданное число без остатка.
        m2();
        // Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
        // Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.
        m3();
        //Дана коллекция строк. Необходимо найти все уникальные слова, которые содержатся в
        //этой коллекции строк, и вернуть их в виде списка.
        m4();
        //Подсчитать буквы в нижнем и верхнем регистре
        m5();

    }
    //Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.
    private static void m1() {
        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
        long fildList = list.stream()
                .filter(st -> st.contains("Java"))
                .count();
        System.out.println("Количество строк, которые содержат заданную подстроку: " + fildList);
    }
    //Дан список целых чисел. Необходимо найти максимальный
    //элемент списка, который делится на заданное число без остатка.
    private static void m2() {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        int divisor = 5;
        Optional<Integer> maxDivisib = list.stream()
                .filter(el -> el % divisor == 0)
                .max(Integer::compareTo);
        maxDivisib.ifPresent(integer -> System.out.println("Максимальный элемент: " + integer + " Делиться на: " + divisor));
    }
    // Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
    // Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.
    private static void m3() {
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Jane", 25),
                new Person("Jack", 30),
                new Person("James", 35),
                new Person("Jill", 40)
        );
        char filtetLett = 'J';
        double age = people.stream()
                .filter(person -> person.getName().contains("J"))
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();
        System.out.println("Имя на букву(J): " + filtetLett + " Срединий возраст" + age);
    }
    //Дана коллекция строк. Необходимо найти все уникальные слова, которые содержатся в
    //этой коллекции строк, и вернуть их в виде списка.
    private static void m4() {
        List<String> lines = Arrays.asList(
                "Java is a programming language.",
                "Java is widely used in enterprise applications.",
                "Python is gaining popularity as a data science tool.",
                "Python is a versatile programming language."
        );
        List<String> stringList = lines.stream()
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(stringList);
    }

    public static void m5() {
        String ss = "KikJhYggfTgf";
        long uppercaseCount = ss.chars()
                .filter(Character::isUpperCase)
                .count();
        long lowercaseCount = ss.chars()
                .filter(Character::isLowerCase)
                .count();
        System.out.println("Кличество букв в верхнем регистре: " + uppercaseCount);
        System.out.println("Кличество букв в нижнем регистре: " + lowercaseCount);



    }


}