package org.example.HomeWork.Massiv;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, 45, 68, 90, 42};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            for (int m : array) {
                sum += m;
            }
            int sumDivis = 0;
            for (int num : array) {
                if (num % 3 == 0 && num % 5 != 0) {
                    sumDivis += num;
                }
            }
            System.out.println("Cумма всех элементов в массиве " + sum);
            System.out.println(sumDivis);
           }
    }
}