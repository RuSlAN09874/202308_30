package org.example.homeWork.assessmenOfStudent;

public interface Comparator<S extends Person> {
    int compareTo(Student student1, Student student2);
}