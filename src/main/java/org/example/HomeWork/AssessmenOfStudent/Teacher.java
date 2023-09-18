package org.example.HomeWork.AssessmenOfStudent;

public class Teacher extends Person {
    private Grade teacherGrade;

    public Teacher(String name, int age, Grade teacherGrade) {
        super(name, age);
        this.teacherGrade = teacherGrade;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String getDescription() {
        if (teacherGrade == null) {
            return "Teacher: " + getName() + " Age: " + getAge();
        } else {
            return "Teacher: " + getName() + " Age: " + getAge() + " AssessmentStudent: " + teacherGrade;
        }
    }

    //Метод выставляет рамдомные оценки.
    public void gradeStudent(Student student) {
        Grade[] stGrade = {Grade.A, Grade.B, Grade.C, Grade.D, Grade.F};
        int grades = (int)
                (Math.random() * stGrade.length);
        // присвоение оценки студенту через setGrade.
        student.setGrade(stGrade[grades]);
    }

}
