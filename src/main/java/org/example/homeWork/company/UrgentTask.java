package org.example.homeWork.company;

import java.util.Date;

public class UrgentTask extends Task{
    public UrgentTask(String title, double rewad){
        super(title,new Date(),1,rewad);
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() * 2;
    }

    @Override
    public double calculateTotalPayment() {
        return calculatePayment();
    }
}