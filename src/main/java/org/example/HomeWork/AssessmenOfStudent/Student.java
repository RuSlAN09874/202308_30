package org.example.HomeWork.AssessmenOfStudent;

public class Student extends Person implements Geraded {
    private Grade grade;

    public Student(String name, int age, Grade grade) {
        super(name, age);
        this.grade = grade;
    }

    public Student(String name, int age) {
        super(name, age);
    }


    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String getDescription() {
        if (grade == null) {
            return "Name: " + getName() + ", Age: " + getAge();
        } else {
            return "Name: " + getName() + ", Age: " + getAge() + ", Assessment: " + grade;
        }
    }

    @Override
    public Grade getGrade() {
        return grade;
    }
}