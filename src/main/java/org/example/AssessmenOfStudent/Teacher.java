package org.example.AssessmenOfStudent;

import java.util.Random;

public class Teacher extends Person {
        Grade teacherGrade;
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Grade teacherGrade) {
        super(name, age);
        this.teacherGrade = teacherGrade;
    }
}
