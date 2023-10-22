package org.example.homeWork.company;

import java.util.ArrayList;
import java.util.List;

public class TaskManager<T extends Task> {
    private List<T> tasks;

    public TaskManager(){
        tasks = new ArrayList<>();
    }
    public void addTask(T task){
        tasks.add(task);
    }
    public double calculateTotalPayment(){
        double totalPayment = 0;
        for (T task: tasks){
            totalPayment += task.calculatePayment();
        }
        return totalPayment;
    }
    abstract class Task {
        public abstract double calculateTotalPayment();
    }
}
