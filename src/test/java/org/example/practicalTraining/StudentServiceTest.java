package org.example.practicalTraining;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void getAllStudentTest() {
        List<Student> studentList = StudentService.getAllStudent();
        Assertions.assertEquals(3,studentList.size());
    }

    @Test
    void addStudent() {

    }

    @Test
    void getStudentsCount() {
    }

    @Test
    void getStudentWithDegree() {
    }

    @Test
    void getAverAge() {
    }

    @Test
    void getQuantityByDegree() {
    }

    @Test
    void getStudentsByDegree() {
    }
}