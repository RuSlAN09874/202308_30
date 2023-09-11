package org.example.AssessmenOfStudent;

public class Student extends Person implements Graded{
    Grade grade;

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public Grade getGrade() {
        return null;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}

