package org.example.AssessmenOfStudent;

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
    public void processStudents(){
        for (Student student: this.students);
    }

    public void processTeachers(){
        for (Teacher teacher: this.teachers);
    }

}


