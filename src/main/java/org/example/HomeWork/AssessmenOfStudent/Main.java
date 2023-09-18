package org.example.HomeWork.AssessmenOfStudent;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Roma", 25);
        Student student2 = new Student("Ira", 28);
        Student student3 = new Student("Misha", 29);
        Student student4 = new Student("Maria", 21);

        Student[] students = {student1, student2, student3, student4};

        Teacher teacher1 = new Teacher("Anatoliy", 45, Grade.C);
        Teacher teacher2 = new Teacher("Vladimir", 54, Grade.A);

        Teacher[] teachers = {teacher1, teacher2};

        GradeManagementSystem gradeManagementSystem = new GradeManagementSystem(students, teachers);
        gradeManagementSystem.processTeachers();
        System.out.println();
        gradeManagementSystem.gradeStudents(teacher1, students);
        gradeManagementSystem.gradeStudents(teacher1, students);
        System.out.println();
        gradeManagementSystem.processStudents();
        gradeManagementSystem.gradeStudents(teacher2, students);
        gradeManagementSystem.gradeStudents(teacher2, students);


    }
}
