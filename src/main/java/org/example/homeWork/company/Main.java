package org.example.homeWork.company;

public class Main {
    public static void main(String[] args) {
        TaskManager<Task> taskManager = new TaskManager<>();
        CodingTask codingTask1 = new CodingTask(10, 80);
        CodingTask codingTask2 = new CodingTask(7, 50);
       DesingTask desigTask1 = new DesingTask(5, 100);
       DesingTask desigTask2 = new DesingTask(3, 200);

        taskManager.addTask(codingTask1);
        taskManager.addTask(codingTask2);
        taskManager.addTask(desigTask1);
        taskManager.addTask(desigTask2);

        double totalPayment = taskManager.calculateTotalPayment();
        System.out.println("Общая сумма оплаты за все задания: " + totalPayment);
    }
}
