package org.example.AdditionalTasks.task25_09_23;

public class MyClass {
private int Value;
private String name;
private double doubleValue;
private char symvol;


    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public char getSymvol() {
        return symvol;
    }

    public void setSymvol(char symvol) {
        this.symvol = symvol;
    }

    public MyClass(int value, String name, double doubleValue, char symvol) {
        Value = value;
        this.name = name;
        this.doubleValue = doubleValue;
        this.symvol = symvol;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "Value=" + Value +
                ", name='" + name + '\'' +
                ", doubleValue=" + doubleValue +
                ", symvol=" + symvol +
                '}';
    }
}
