package org.example.AdditionalTasks.Task18_09_23;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task {
    //Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран.
    public void elemHashMapAndTreeMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Name1");
        hashMap.put(2, "Name2");
        hashMap.put(3, "Name3");
        hashMap.put(4, "Name4");
        for (Map.Entry<Integer, String> elem : hashMap.entrySet()) {
            System.out.println("Key: " + elem.getKey() + "String" + elem.getValue());

            TreeMap<Integer, String> treeMap = new TreeMap<>();
            treeMap.put(5, "Name5");
            treeMap.put(6, "Name6");
            treeMap.put(7, "Name7");
            for (Map.Entry<Integer, String> el : treeMap.entrySet()) {
                System.out.println("Key: " + el.getKey() + "String" + el.getValue());
            }
        }
    }

    //  Переберите только ключи в HashMap и TreeMap и найдите сумму их длин.
    public int getLengthHashMapKey() {
        HashMap<Integer, Integer> hashMapp = new HashMap<>();
        hashMapp.put(1, +49);
        hashMapp.put(2, +48);
        hashMapp.put(3, +38);
        hashMapp.put(4, +34);
        int sum = 0;
        for (Integer key : hashMapp.keySet()) {
            sum = sum + key;
        }
        return sum;
    }

    public int getLenghTreeMapKey() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Sfa");
        treeMap.put(2, "asd");
        treeMap.put(3, "KOkofw");
        treeMap.put(4, "drgewe");
        int sum = 0;
        for (Integer key : treeMap.keySet()) {
            sum = sum + key;
        }
        return sum;
    }

    //Переберите только значения в HashMap и TreeMap и найдите их среднее значение.
    public void getMediumValueHashMap() {
        HashMap<Integer, String> mapHash = new HashMap<>();
        mapHash.put(1, "Key1");
        mapHash.put(2, "Key2");
        mapHash.put(3, "Key3");
        int sum = 0;
        int mediumValue = 0;
        for (Integer m : mapHash.keySet()) {
            sum += m;
            mediumValue = sum / mapHash.size();
        }
        System.out.println("Cредние значение HashMap: " + mediumValue);
    }

    public void getMediumValueTreeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "Key4");
        treeMap.put(5, "Key4");
        treeMap.put(6, "Key4");
        int sum = 0;
        int mdValue = 0;
        for (Integer num : treeMap.keySet()) {
            sum += num;
            mdValue = sum / treeMap.size();
        }
        System.out.println("Cредние значение TreeMap: " + mdValue);
    }

    //Переберите HashMap и найдите ключ с максимальным значением.
    public void getMaxValHashMap() {
        HashMap<Integer, String> mapHash = new HashMap<>();
        mapHash.put(10, "Key1");
        mapHash.put(34, "Key2");
        mapHash.put(54, "Key3");
        int max = Integer.MIN_VALUE;
        for (Integer value : mapHash.keySet()) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Ключ с максимальным значением: " + max);
    }

    //Переберите TreeMap и найдите ключ с минимальным значением.
    public void getMinValTreeMap() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(232, +49);
        treeMap.put(100, +43);
        treeMap.put(323, +48);
        int min = Integer.MAX_VALUE;
        for (Integer value : treeMap.keySet()) {
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Ключ с минимальным значением: " + min);
    }

    //Переберите HashMap и удалите все элементы с четными значениями.
    public void getDeletEven() {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 213);
        hashMap.put(2, 1312);
        hashMap.put(3, 353);
        hashMap.put(4, 757);
        hashMap.put(5, 4353);

        HashMap<Integer, Integer> hashList = new HashMap<>();
        for (Map.Entry<Integer, Integer> en : hashMap.entrySet()) {
            if (en.getKey() % 2 != 0) {
                hashList.put(en.getKey(), en.getValue());
            }
        }
        hashMap = hashList;
        System.out.println("Не четные элементы: " + hashMap);
    }

    //Переберите TreeMap и удалите все элементы с ключами, начинающимися с буквы 'A'.
    public void getDelElemKeyTreeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Apple");
        treeMap.put(2, "Kiwi");
        treeMap.put(1, "Mango");
        treeMap.put(1, "Almond");

    }
}



