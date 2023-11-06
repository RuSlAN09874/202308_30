package org.example.practicalTraining.lesson23_11_06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {
    private StudentService service;

    @BeforeEach
    public void init() {
        service = new StudentService();
        service.createStudent("NameSt", 29, Degree.BACHELOR);
    }

    // Проверка на доб студента
    @Test
    public void checkAddNewStudent() {
        Student student = service.getStudentById(1);
        assertNotNull(student);
    }

    @Test
    public void checkIncorrectAgeStudent() {
        try {
            service.createStudent("NameSt", 101, Degree.MASTER);
        } catch (IllegalArgumentException e) {
            return;
        }
       fail();
    }

    @Test
    public void checkStudentProperts() {
        Student student = service.getAllStudents().get(0);
        assertEquals("NameSt", student.getName());
        assertEquals(29, student.getAge());
        assertEquals(Degree.BACHELOR, student.getDegree());
    }

    // На эквивалентность
    @Test
    public void checkStudenstEqualiti() {
        Student expectetStudent = new Student(1, "NameSt", 29, Degree.BACHELOR);
        Student actualStudent = service.getStudentById(1);
        assertEquals(expectetStudent, actualStudent);
    }

    @Test
    public void checkStudentsCount() {
        service.createStudent("NameSt", 29, Degree.BACHELOR);
        service.createStudent("NameSt2", 30, Degree.MASTER);

        int expectedSiz = 3;
        int actualSize = service.getStudentsCount();
        assertEquals(expectedSiz, actualSize);
    }

    @Test
    public void checkStudentsCountByDegree() {
        service.createStudent("NameSt", 29, Degree.BACHELOR);
        service.createStudent("NameSt2", 30, Degree.BACHELOR);
        service.createStudent("NameSt3", 30, Degree.MASTER);
        service.createStudent("NameSt4", 20, Degree.BACHELOR);
        service.createStudent("NameSt5", 24, Degree.MASTER);

        long expectetCountMaster = 2;
        long actualCountMaster = service.getStudentsCountByDegree(Degree.MASTER);
        assertEquals(expectetCountMaster, actualCountMaster);
    }


}