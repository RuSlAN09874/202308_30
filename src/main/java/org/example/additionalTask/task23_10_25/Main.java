package org.example.additionalTask.task23_10_25;

import com.github.javafaker.Faker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(new Faker().name().name(), 25, 5));
        List<Student> additionalStudent = List.of(
                new Student(new Faker().name().name(), 20, 2),
                new Student(new Faker().name().name(), 21, 3),
                new Student(new Faker().name().name(), 28, 4),
                new Student(new Faker().name().name(), 26, 5),
                new Student(new Faker().name().name(), 18, 3)
        );
        students.addAll(additionalStudent);
        String filename = "student.txt";
        saveStudentsToFile(students, filename);
        List<Student> loadedStudent = loadStudentsFromFile(filename);
        for (Student student : loadedStudent) {
            System.out.println("Name: " + student.getName() + " Age: " + student.getAge() + " Grade: " + student.getGrade());
        }
        double gradeThreshold = 0.0;
        filename = "gradeThresholdStudent.txt";
        filterAndSaveStudentsByGrade(students, gradeThreshold, filename);
        filename = "AverageGrade.txt";
        double average = calculateAverageGrade(filename);
        System.out.println("Аverage score: " + average);

    }

    public static void saveStudentsToFile(List<Student> students, String filename) {
        try {
            ObjectOutputStream out = new ObjectOutputStream
                    (new FileOutputStream(filename));
            out.writeObject(students);
            System.out.println("Serialization was done");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Student> loadStudentsFromFile(String filename) {
        List<Student> list;
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename));
            list = (List<Student>) input.readObject();
            System.out.println("Serialization was done");

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void filterAndSaveStudentsByGrade(List<Student> students, double gradeThreshold, String filename) {
        List<Student> studentList = students.stream()
                .filter(student -> student.getGrade() > gradeThreshold)
                .toList();
        try {
            ObjectOutputStream out = new ObjectOutputStream
                    (new FileOutputStream(filename));
            out.writeObject(studentList);
            System.out.println("Serialization was done");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static double calculateAverageGrade(String filename) {
        List<Student> students = loadStudentsFromFile(filename);
        if (students.isEmpty()) {
            return 0.0;
        }
        double grade = 0.0;
        for (Student student : students) {
            grade += student.getGrade();
        }
        return grade / students.size();
    }

    public static void saveListStudent(List<Student> students, String fielname){

    }
}
