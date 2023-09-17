package org.example.Task;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Co");
        strings.add("lor: ");
        strings.add("Blue");
        String mergeSt = "";
        for (int i = 0; i < strings.size(); i++) {
            mergeSt = mergeSt + strings.get(i);
        }
        System.out.println(mergeSt);
    }
}



