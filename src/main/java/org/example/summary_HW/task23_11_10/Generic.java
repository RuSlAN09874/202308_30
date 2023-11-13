package org.example.summary_HW.task23_11_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        // Task 1.a  - Написать Generic метод <T> List<T> makeList(T[] t), который преобразует массив в список
        List<Integer> ints = makeList(new Integer[]{1, 2, 3});
        List<String> strings = makeList(new String[]{"A", "B", "C"});

        // Task 1.b - Написать Generic метод <T> T[] makeArray(List<T> list), который преобразует список в массив
    /*    Integer[] intsArray = makeArray(Arrays.asList(1, 2, 3));
        String[] stringsArray = makeArray(Arrays.asList("A", "B", "C"));*/
    }

    public static <T> List<T> makeList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
