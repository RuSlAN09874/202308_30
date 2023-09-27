package org.example.additional_task.task25_09_23;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //- Создать 10 объектов класса
        MyClass persen1 = new MyClass(24, "Ob1", 23.04, 'V');
        MyClass persen2 = new MyClass(565, "Ob2", 80.45, 'A');
        MyClass persen3 = new MyClass(1, "Ob3", 321.00, 'B');
        MyClass persen4 = new MyClass(5, "Ob4", 00.23, 'C');
        MyClass persen5 = new MyClass(52, "Ob5", 23.04, 'D');
        MyClass persen6 = new MyClass(10, "Ob6", 232.04, 'F');
        MyClass persen7 = new MyClass(234, "Ob7", 22233.04, 'W');
        MyClass persen8 = new MyClass(100, "Ob8", 1243.04, 'Q');
        MyClass persen9 = new MyClass(98, "Ob9", 234242.04, 'L');
        MyClass persen10 = new MyClass(45, "Ob10", 2231345.04, 'N');
        //Поместить все с Хэш СЕт и вывести на экран

        Set<MyClass> hashSet = new HashSet<>();
        hashSet.add(persen1);
        hashSet.add(persen2);
        hashSet.add(persen3);
        hashSet.add(persen4);
        hashSet.add(persen5);
        hashSet.add(persen6);
        hashSet.add(persen7);
        hashSet.add(persen8);
        hashSet.add(persen9);
        hashSet.add(persen10);

        for (MyClass object : hashSet) {
            System.out.println(object);
        }

    }
}
