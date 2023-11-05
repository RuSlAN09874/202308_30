package org.example.practicalTraining;

public class Student {
    private int id;
    private String name;
    private int age;
    private Degree degree;

    public Student(String name, int age, Degree degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        StudentService.addStudent(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
