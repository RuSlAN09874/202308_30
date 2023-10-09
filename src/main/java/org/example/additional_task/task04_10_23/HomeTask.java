package org.example.additional_task.task04_10_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HomeTask {
    public static void main(String[] args) {
        // Фильтрация четных чисел и умножение на 2.
        List<Integer> number = Arrays.asList(12, 45, 77, 90, 65, 78, 94);
        List<Integer> filtNum = number.stream()
                .filter(el -> el % 2 == 0)
                .map(num -> num * 2)
                .toList();
        System.out.println("Ответ: " + filtNum);

        // Удаление дубликатов из списка строк.
        List<String> stringList = Arrays.asList("Car", "Airplane", "Car", "Train", "Airplane", "Bus");
        List<String> delitDublicat = stringList.stream()
                .distinct()
                .toList();
        System.out.println("После удаление дубликатов остались строки: " + delitDublicat);

        // Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
        List<Integer> numbers = Arrays.asList(12, 45, 77, 90, 65, 78, 94, 5);
        List<Integer> sotrNum = numbers.stream()
                .sorted()
                .limit(3)
                .toList();
        System.out.println("Выбор первых трех элементов из потока: " + sotrNum);

        // Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.
        List<String> strings = Arrays.asList("Avia", "Car", "Train", "Apple");
        List<String> filterLet = strings.stream()
                .filter(el -> el.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
        System.out.println("Cтроки начинающиеся на букву (А): " + filterLet);

        // Пропуск первых двух элементов и вывод оставшихся.
        List<Integer> elem = Arrays.asList(12, 45, 77, 90, 65, 78, 94, 5);
        List<Integer> numElem = elem.stream()
                .skip(2)
                .toList();
        System.out.println("Оставшиеся элементы: " + numElem);

        // Фильтрация чисел больше 50 и вывод их квадратов.
        List<Integer> listNum = Arrays.asList(30, 12, 45, 78, 7, 89, 100, 1);
        List<Integer> squaredNumbers = listNum.stream()
                .filter(num -> num > 50)
                .map(num -> num * num)
                .toList();
        System.out.println("Квадрат чисел больше 50: " + squaredNumbers);

        // Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.
        List<String> elements = Arrays.asList("Swift", "Login", "Boss", "Original", "Top", "Object");
        List<String> letterSort = elements.stream()
                .filter(el -> el.contains("o"))
                .sorted()
                .toList();
        System.out.println("Слова содержащие букву (о): " + letterSort);

        // Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.
        List<Integer> numberr = Arrays.asList(23, 56, 89, 53, 12, 44, 78);
        List<Integer> filNum = numberr.stream()
                .filter(el -> el % 2 == 1)
                .sorted()
                .toList();
        System.out.println("Порядок возрастания чисел: " + filNum);

        // Получить среднее значение чисел в списке.
        List<Integer> numbList = Arrays.asList(23, 56, 89, 53, 12, 44, 78);
        double medNum = numbList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Средние значение: " + medNum);

        // Получить строку, объединяющую элементы списка через запятую.
        // Не могу понять как работает 83 строка кода (элементы не обьеденились)
        List<String> elementsLis = List.of("ABED");
        String result = String.join(", ", elementsLis);
        System.out.println("ДЗ не сделанно: " + result);

        // Получить список квадратов чисел из другого списка.
        List<Integer> integerList = Arrays.asList(1, 5, 7, 98, 78, 24);
        List<Integer> squares = integerList.stream()
                .map(numb -> numb * numb)
                .toList();
        System.out.println("Cписок квадратов чисел из другого списка: " + squares);

        // Получить список букв из списка слов и вывести их в алфавитном порядке.
        List<String> world = Arrays.asList("swift", "login", "boss", "original", "scanner", "apple");
        List<Character> characterList = world.stream()
                .flatMap(worlds -> worlds.chars().mapToObj(ch -> (char) ch))
                .sorted()
                .distinct()
                .toList();
        System.out.println("Буквы в алфовитном порядке: " + characterList);

        // Получить первые 3 строки из списка и вывести их в обратном порядке.
        List<String> list = Arrays.asList("String1", "String2", "String3", "String4", "String5");
        List<String> elemList = list.stream()
                .limit(3)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Вывод в обратном порядке: " + elemList);

        // Пропустить первые 2 элемента и оставить только уникальные.
        List<String> stringList1 = Arrays.asList("Samsung", "Car", "Airplane", "Car", "Train", "Airplane", "Bus");
        List<String> stElem = stringList1.stream()
                .skip(2)
                .distinct()
                .toList();
        System.out.println("Уникальные элементы: " + stElem);

        // Фильтрация и сортировка пользователей по возрасту.
        List<User> userList = new ArrayList<>();
        userList.add(new User("User1", 24));
        userList.add(new User("User2", 17));
        userList.add(new User("User3", 35));
        userList.add(new User("User4", 57));
        userList.add(new User("User4", 10));
        int filterAge = 18;
        List<User> filteredUsers = userList.stream()
                .filter(user -> user.getAge() >= filterAge)
                .sorted(Comparator.comparing(User::getAge))
                .toList();
        System.out.println(filteredUsers);
    }
}