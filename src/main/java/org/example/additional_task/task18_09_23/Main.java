package org.example.additional_task.task18_09_23;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Apple");
        treeMap.put(2, "Kiwi");
        treeMap.put(3, "Mango");
        treeMap.put(4, "Almond");
        String stDelet = "A";
        for (String elem : treeMap.values()) {
            System.out.println(elem);
        }
        for (int i = 0; i < treeMap.size(); i++) {
            String st = treeMap.get(i);
            if (st.contains(stDelet)) {
                treeMap.remove(i);
                i--;
            }
            for (String newTreeMap : treeMap.values()) {
                System.out.println(newTreeMap);
            }

        }
    }
}