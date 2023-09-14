package org.example.AssessmenOfStudent;

public interface Comparator<S extends Person> {
    int compareTo(Student student1, Student student2);
}
