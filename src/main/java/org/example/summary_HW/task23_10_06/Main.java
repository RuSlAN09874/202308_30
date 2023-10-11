package org.example.summary_HW.task23_10_06;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Создать Supplier randomJoke, который выдает пользователю случайный анекдот из заготовленного
        //                                 исходного списка анекдотов.
        Supplier<String> randomJoke = () -> {
            List<String> jokes = Arrays.asList("Анекдот 1", "Анекдот 2", "Анекдот 3");
            Random random = new Random();
            int index = random.nextInt(jokes.size());
            return jokes.get(index);
        };
        String joke = randomJoke.get();
        System.out.println(joke);
        //  Создать Consumer, который принимает числа и печатает четные числа в поток System.out,
        //                               а нечетные числа в System.err.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Consumer<Integer> printNumbers = number -> {
            if (number % 2 == 0) {
                System.out.println("Четное число: " + number);
            } else {
                System.err.println("Нечетное число: " + number);
            }
        };
        numbers.forEach(printNumbers);
        //Создать Predicate isYellowMonkey, который проверяет, желтого ли цвета обезьянка Monkey.
        Predicate<String> isYellowMonkey = monkeyColor -> monkeyColor.equalsIgnoreCase("yelow");
        System.out.println(isYellowMonkey.test("yelow"));
        //Создать с помощью методов Function .compose() и .andThen() функцию convertToCelsius, которая:
        //1) заменяет исходное число типа Integer на его строковое представление, добавляя в строковом представлении
        //                         перед числом его знак (+ или -)
        //2)добавляет после числа текст "degrees Celsius"
        //3)ограничивает значения числа значениями +/- 100, выдавая граничные значения при превышении диапазона
        //convertToCelsius.apply(-150) вернет "-100 degrees Celsius"
        //convertToCelsius.apply(150) вернет "+100 degrees Celsius"
        Function<Integer, String> convertToCelsius = ((Function<Integer, Integer>) num -> Math.min(Math.max(num, -100), 100))
                .andThen(num -> (num >= 0 ? "+" : "-") + num)
                .andThen(num -> num + " degrees Celsius");
        System.out.println(convertToCelsius.apply(-150));
        System.out.println(convertToCelsius.apply(150));
    }

}

