package org.example.summary_HW.task23_10_26;

import lombok.Data;

@Data
public class Monkey {
    private String name;
    private int age;
    private String colour;
    private boolean isHungry;
    private double weight;

    public Monkey(String name, int age, String colour, boolean isHungry, double weight) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.isHungry = isHungry;
        this.weight = weight;
    }
}
