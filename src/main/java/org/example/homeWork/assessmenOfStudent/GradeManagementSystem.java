package org.example.homeWork.assessmenOfStudent;

public class GradeManagementSystem {
    private Student[] students;
    private Teacher[] teachers;

    public GradeManagementSystem(Student[] students, Teacher[] teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public void processStudents() {
        for (Student student : this.students) {
            System.out.println(student.getDescription());
        }
    }

    public void processTeachers() {
        for (Teacher teacher : this.teachers) {
            System.out.println(teacher.getDescription());
            ;
        }
    }

    public void gradeStudents(Teacher teacher, Student[] students) {
        // прохожусть циклом по массиву students выставляя для каждого студента оценку.
        for (Student student : students) {
            teacher.gradeStudent(student); // Вызвал методот gradeStudent(student).
        }
    }
}