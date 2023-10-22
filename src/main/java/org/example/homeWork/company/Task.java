package org.example.homeWork.company;

import lombok.Data;
import java.util.Date;

@Data
public abstract class Task {
    private String title;
    private Date deadline;
    private int priority;
    private double reward;

    public Task(String title, Date deadline, int priority, double reward) {
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
        this.reward = reward;
    }

    public Task() {
    }

    public double calculatePayment() {
        return 00.0;
    }

    public <T extends Task> void addTask(T task) {
    }

    public abstract double calculateTotalPayment();
}