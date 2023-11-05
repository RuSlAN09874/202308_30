package org.example.practicalTraining;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentService {
    private static int countID;

    private static Map<Integer, Student> studentMap = new HashMap<>();


    public static List<Student> getAllStudent() {
        return studentMap.values().stream().collect(Collectors.toList());
    }


    public static void addStudent(Student student) {
        student.setId(++countID);
        studentMap.put(student.getId(), student);
    }

    public static int getStudentsCount() {
        return studentMap.size();
    }

    public static int getStudentWithDegree(Degree degree) {
        int countDegree = (int) studentMap.values().stream()
                .filter(s -> s.getDegree().equals(degree)).count();

        return countDegree;

    }

    public static double getAverAge() {
        double asDouble = studentMap.values().stream()
                .mapToInt(x -> x.getAge())
                .average()
                .getAsDouble();
        return asDouble;
    }

    public static int getQuantityByDegree(Degree degree) {
        return (int) studentMap.values().stream()
                .filter(st -> st.getDegree().equals(degree))
                .count();
    }

    public static List<Student> getStudentsByDegree(Degree degree) {
        return (List<Student>) studentMap.values().stream()
                .filter(el -> el.getDegree().equals(degree))
                .toList();
    }
}
