package org.example.summary_HW.task;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Monkey> monkeys = new ArrayList<>();
        monkeys.add(new Monkey("Mankey1", 6, "Brown", false, 9.00));
        monkeys.add(new Monkey("Mankey2", 10, "Gray", false, 14.5));
        monkeys.add(new Monkey("Mankey3", 8, "Brown", false, 12.6));
        monkeys.add(new Monkey("Mankey4", 2, "Black", false, 2.00));

        //Получить Map имя / информация, голодна ли обезьянка
        Map<String, Boolean> nameHungry = new HashMap<>();
        for (Monkey monkey : monkeys) {
            nameHungry.put(monkey.getName(), monkey.isHungry());
        }
        //Получить Map цвет / количество обезьян данного цвета
        Map<String, Integer> colorCountMap = new HashMap<>();
        for (Monkey monkey : monkeys) {
            String color = monkey.getColour();
            colorCountMap.put(color, colorCountMap.getOrDefault(color, 0) + 1);
        }
        //Получить Map> цвет / список имен обезьян данного цвета
        Map<String, List<String>> colorNameMap = new HashMap<>();
        for (Monkey monkey : monkeys) {
            String color = monkey.getColour();
            List<String> name = colorNameMap.getOrDefault(color, new ArrayList<>());
            name.add(monkey.getName());
            colorNameMap.put(color, name);

        }
        //Создать компаратор и отсортировать исходный список по весу и имени
        Comparator<Monkey> weightAndNameComparator = Comparator.comparingDouble(Monkey::getWeight)
                .thenComparing(Monkey::getName);
        Collections.sort(monkeys, weightAndNameComparator);

        System.out.println("Информация голодна ли обезьянка или нет: ");
        System.out.println(nameHungry);

        System.out.println("Количество обезьян данного цвета: ");
        System.out.println(colorCountMap);

        System.out.println("Cписко имени обезьян данного цета: ");
        System.out.println(colorNameMap);
    }
}
