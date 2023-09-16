package org.example.AdditionalTask.MassivList;

import java.util.ArrayList;
import java.util.List;

public class ListMass {
    public static void main(String[] args) {
//        Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.
// Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.
// Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
//  1.Перебрать ArrayList<Integer> и найти второй по величине элемент.
//        List<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        Integer max = Integer.MIN_VALUE;
//        for (Integer array : arr) {
//            if (array > max) {
//                max = array;
//            }
//        }
//        System.out.println(max);

//  2.Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        for (int i = arr.size() - 1; i >= 0; i--) {
            Integer maxElem = arr.get(i);
            System.out.println(maxElem);

        }
    }
}
