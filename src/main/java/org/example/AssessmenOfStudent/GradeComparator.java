package org.example.AssessmenOfStudent;

public class GradeComparator implements Comparator <Student> {

    @Override
    public int compareTo(Student student1, Student student2) {
        return student1.getGrade().compareTo(student2.getGrade());
    }
}
