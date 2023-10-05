package org.example.HomeWork.AssessmenOfStudent;

public interface Comparator<S extends Person> {
    int compareTo(Student student1, Student student2);
}