package org.example.additionalTask.task23_10_09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LessTask {
    public static void main(String[] args) {
        // Фильтрация списка целых чисел на нечетные числа
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(new LessTask().doTask(numbers));

        // Преобразование списка строк в список чисел
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> integerList = strings.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println(integerList);

        // Суммирование списка чисел
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(new LessTask().tastSum(number));

        // Определение максимального значения в списке
        List<Integer> num = Arrays.asList(12, 45, 788, 65, 98, 100);
        int maxNum = num.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        System.out.println(maxNum);

        // Фильтрация списка строк на те, которые начинаются с определенной буквы
        //              и преобразование их в верхний регистре
        List<String> listSt = Arrays.asList("Banana", "Train", "Avia", "Iphone", "Apple");
        List<String> filterSt = listSt.stream()
                .filter(el -> el.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(filterSt);

        //  Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
        List<String> list = words.stream()
                .filter(el -> el.length() > 4)
                .toList();
        System.out.println(list);

        // Нахождение суммы чисел, кратных 3 и 5, из списка чисел
        List<Integer> integerList1 = Arrays.asList(1, 4, 6, 8, 9, 10);
        int sum = integerList1.stream()
                .filter(el -> el % 3 == 0 || el % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        // Получение списка слов, содержащих только уникальные символы, из списка строк
        List<String> word = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
        List<String> wordLis = word.stream()
                .filter(wordst -> wordst.chars().distinct().count() == wordst.length())
                .toList();
        System.out.println(wordLis);

        // Преобразование списка объектов класса в список их имен, отсортированных по возрасту
        List<Person> people = Arrays.asList
                (new Person("John", 25),
                 new Person("Alice", 22),
                 new Person("Bob", 30));
        List<String> filtAge = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(filtAge);

    }

    public List<Integer> doTask(List<Integer> list) {
        return list.stream()
                .filter(el -> el % 2 == 1)
                .toList();
    }

    public int tastSum(List<Integer> integers) {
        return integers.stream()
                .reduce(0, Integer::sum);

    }
}
