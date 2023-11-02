package org.example.summaryTraining;

import org.example.summary_HW.task.Monkey;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Monkey monkey1 = new Monkey("A", 3, "grey", false, 10.9);
        Monkey monkey2 = new Monkey("A", 2, "white", true, 10.1);
        Monkey monkey3 = new Monkey("T", 3, "grey", false, 5);
        Monkey monkey4 = new Monkey("J", 2, "black", true, 7);
        Monkey monkey5 = new Monkey("Y", 1, "grey", true, 6);

        List<Monkey> monkeys = new ArrayList<>();
        monkeys.add(monkey1);
        monkeys.add(monkey2);
        monkeys.add(monkey3);
        monkeys.add(monkey4);
        monkeys.add(monkey5);
        //Получить Map имя / информация, голодна ли обезьянка
        Map<String, Boolean> hungryManky = monkeys.stream()
                .collect(Collectors.toMap(Monkey::getName,Monkey::isHungry));

        //Получить Map цвет / количество обезьян данного цвета
        Map<String, Long> colourMap = monkeys.stream()
                .collect(Collectors.groupingBy(Monkey::getColour, Collectors.counting()));

        //Получить Map цвет / список имен обезьян данного цвета
        /* Map<String, List<String>> colourNamesMap = monkeys.stream()
                .collect(Collectors.groupingBy(Monkey::getColour,
                        Collectors.mapping(Monkey::getName,Collectors.toList());


        //Создать компаратор и отсортировать исходный список по весу и имени
        monkeys.sort(Comparator.comparingDouble(Monkey::getWeight)
                .thenComparing(Monkey::getName));

         */
    }
}
