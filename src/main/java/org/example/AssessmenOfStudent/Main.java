package org.example.AssessmenOfStudent;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Roma", 25);
        Student student2 = new Student("Ira", 28);
        Student student3 = new Student("Misha", 29);
        Student student4 = new Student("Maria", 21);

        Student[] students = {student1,student2,student3,student4};

        Teacher teacher1 = new Teacher("Atoliy", 45);
        Teacher teacher2 = new Teacher("Vladimir", 54);

        Teacher[] teachers = {teacher1,teacher2};


    }
}
