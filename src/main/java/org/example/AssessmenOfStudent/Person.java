package org.example.AssessmenOfStudent;

public abstract class Person {
  private   String name;
  private   int age;

  public void getDescription() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
