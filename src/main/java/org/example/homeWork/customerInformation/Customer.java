package org.example.homeWork.customerInformation;

import java.util.*;
import java.util.stream.Collectors;

public class Customer {
    // Создание карты, где ключ - первая буква имени, значение - количество таких имен
    public static Map<Character, Integer> createCountMap(List<String> list) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (String line : list) {
            String[] parts = line.split(" - ");

            if (parts.length == 2) {
                String name = parts[1].trim(); //trim() Этот метод можно использовать для удаления
                                              // пробелов в начале и конце строки.Возвращает строку,
                                             // значением которой является эта строка,
                                            // без всех начальных и конечных пробелов .
                if (!name.isEmpty()) {
                    char firstLetter = name.charAt(0);
                    characterIntegerMap.put(firstLetter,
                            characterIntegerMap.getOrDefault(firstLetter, 0) + 1);
                }
            }
        }
        return characterIntegerMap;
    }
    // Нахождение самой часто встречающейся первой буквы в именах
    public static char findMostFrequentFirstLetter(List<String> lines) {
        return (char) lines.stream()
                .map(line -> line.split(" - ")[1].trim())
                .filter(name -> !name.isEmpty())
                .collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElseThrow(NoSuchElementException::new);
    }

    // Создание списка номеров телефонов в числовом формате
    public static List<Long> createNumericPhoneList(List<String> lines) {
        return lines.stream()
                .map(line -> line.replaceAll("[^0-9]", ""))
                .map(Long::parseLong)
                .collect(Collectors.toList());
    }

    // Группировка имен по длине
    public static Map<Integer, List<String>> groupNamesByLength(List<String> lines) {
        return lines.stream()
                .map(line -> line.split(" - ")[1].trim())
                .filter(name -> !name.isEmpty())
                .collect(Collectors.groupingBy(String::length));
    }

    // Поиск уникальных фамилий
    public static Set<String> findUniqueLastNames(List<String> lines) {
        return lines.stream()
                .map(line -> line.split(" - ")[1].trim().split(" ")[1].trim())
                .collect(Collectors.toSet());
    }

    // Создание списка имен, отсортированного в обратном алфавитном порядке
    public static List<String> reverseSortNames(List<String> lines) {
        return lines.stream()
                .map(line -> line.split(" - ")[1].trim())
                .filter(name -> !name.isEmpty())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    // Преобразование данных в формат имя=номер
    public static List<String> formatNameNumberPairs(List<String> lines) {
        return lines.stream()
                .map(line -> line.split(" - "))
                .map(parts -> parts[1].trim() + "=" + parts[0].replaceAll("[^0-9]", ""))
                .collect(Collectors.toList());
    }

    // Расчет средней длины имени
    public static double calculateAverageNameLength(List<String> lines) {
        return lines.stream()
                .map(line -> line.split(" - ")[1].trim())
                .filter(name -> !name.isEmpty())
                .mapToInt(String::length)
                .average()
                .orElse(0.0);
    }

    // Создание карты, где ключ - номер телефона, значение - имя
    public static Map<String, String> createPhoneNumberNameMap(List<String> lines) {
        return lines.stream()
                .map(line -> line.split(" - "))
                .collect(Collectors.toMap(parts -> parts[0].replaceAll("[^0-9]", ""),
                        parts -> parts[1].trim()));
    }
}


