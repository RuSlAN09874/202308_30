package org.example.additionalTask.task23_10_23;

import java.io.*;
import java.util.*;

public class BufferedReader {
    public static void main(String[] args) {
        String filName = "src/main/java/org/example/additionalTask/task23_10_23/names.txt";
        long totalNames = countTotalNames(filName);
        System.out.println("Общее число имен в файле: " + totalNames);
        Set<String> uniqueNames = uniqueNames(filName);
        System.out.println("Уникальные имена в файле: " + "\n" + uniqueNames);
        long count = countNamesContainingSubstring(filName, "on");
        System.out.println("Именa содержащие заданную подстроку (on): " + count);
        List<String> namesLine = namesWithLengthInRange(filName, 3, 4);
        System.out.println("Имена в заданом диапазоне из файла: " + namesLine);
        List<String> firstName = firstNNamesAlphabetically(filName,5);
        System.out.println("Вывод первых N имен в алфавитном порядке: " + firstName);
    }

    //Подсчет общего числа имен в файле
    public static long countTotalNames(String fileName) {
        long totalNames = 0;
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] names = line.split(" ");
                totalNames += names.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalNames;
    }

    //Нахождение уникальных имен в файле
    public static Set<String> uniqueNames(String fileName) {
        Set<String> uniqueNames = new HashSet<>();
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] names = line.split(" ");
                for (String name : names) {
                    uniqueNames.add(name);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return uniqueNames;
    }

    //Подсчет числа имен, содержащих заданную подстроку
    public static long countNamesContainingSubstring(String fileName, String substring) {
        long count = 0;
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] names = line.split(" ");
                for (String name : names) {
                    if (name.contains(substring)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    //Нахождение имен, длина которых находится в заданном диапазоне
    public static List<String> namesWithLengthInRange(String fileName, int minLength, int maxLength) {
        List<String> resultName = new ArrayList<>();
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] names = line.split(" ");
                for (String name : names) {
                    name = name.trim();
                    if (name.length() >= minLength && name.length() <= maxLength) {
                        resultName.add(name);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultName;
    }

    //Вывод первых N имен в алфавитном порядке
    public static List<String> firstNNamesAlphabetically(String fileName, int n) {
        List<String> names = new ArrayList<>();
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(names);
        return names.subList(0,Math.min(n,names.size()));
    }

}