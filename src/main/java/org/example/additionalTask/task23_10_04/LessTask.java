package org.example.additionalTask.task23_10_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LessTask {
    public static void main(String[] args) {
        // Фильтрация списка целых чисел на нечетные числа
        List<Integer> list = Arrays.asList(12, 45, 67, 55, 2, 1, 89);
        List<Integer> lists = list.stream()
                .filter(el -> el % 2 == 1)
                .toList();
        System.out.println("Не четные числа: " + lists);

        //Преобразование списка строк в список чисел
        List<String> strings = Arrays.asList("1", "2", "3", "4");
        List<Integer> numString = strings.stream()
                .map(Integer::parseInt) // метод который переобразует строки в целые числа
                .toList();
        System.out.println("Список чисел: " + numString);

        //Суммирование списка чисел
        List<Integer> num = Arrays.asList(12, 46, 78, 24, 90, 32);
        int sum = num.stream()
                .mapToInt(Integer::intValue) // метод для математических операций
                .sum(); // cумма всех чисел
        System.out.println("Сумма чисел: " + sum);

        //Определение максимального значения в списке
        List<Integer> number = Arrays.asList(12, 46, 78, 24, 90, 32);
        int maxNumber = number.stream()
                .mapToInt(Integer::intValue)
                .max() // максимально значение в потоке
                .getAsInt(); // получение максимального значения
        System.out.println("Максимальное значение в списке: " + maxNumber);

        //Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование
        //                         их в верхний регистр.
        List<String> listSt = Arrays.asList("Banana", "Train", "Avia", "Iphone", "Apple");
        List<String> filterSt = listSt.stream()
                .filter(el -> el.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
        System.out.println("Список строк начинаються в определенной буквы (А): " + filterSt);

        //Получение списка уникальных слов из списка строк, длина которых больше 4 символов.
        List<String> textList = Arrays.asList("Карандаш", "Ручка", "Рука", "Ручка", "Пар");
        List<String> filterText = textList.stream()
                .filter(el -> el.length() > 4) // фильтрация строк по их длине
                .distinct() // метод для удалиене повторяющихся элементов
                .toList();
        System.out.println("Уникальные слова из списка: " + filterText);

        //Получение списка слов, содержащих только уникальные символы, из списка строк.
        // Данная задача не решена так как выводит все слова из списка!!!
        List<String> simvol = Arrays.asList("User", "Human", "Unit", "World");
        List<String> uniqueSimvol = simvol.stream()
                .filter(LessTask::hasUniqueChar)
                .collect(Collectors.toList());
        System.out.println(uniqueSimvol);
    }

    public static boolean hasUniqueChar(String word) {
        return word.chars()
                .distinct()
                .count() == word.length();
    }
}