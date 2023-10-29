package org.example.summary_HW.task23_10_26;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

    }
/*    public static void feed(List<Animal> catList) {
        catList.stream()
                .filter(Animal::isHungry)
                .forEach(cat -> cat.setHungry(false));
    }*/
    public static int getSum(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static Map<Boolean, List<Integer>> getMap() {
        return IntStream.range(0, 100)
                .boxed()
                .collect(Collectors.partitioningBy(i -> i % 3 == 0));
    }
}
