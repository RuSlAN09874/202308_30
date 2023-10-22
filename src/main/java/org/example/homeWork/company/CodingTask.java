package org.example.homeWork.company;

public class CodingTask extends Task {
    private int hoursWork;
    private double hourRate;

    public CodingTask(int hoursWork, double hourRate) {
        this.hoursWork = hoursWork;
        this.hourRate = hourRate;
    }

    @Override
    public double calculatePayment() {
        return hoursWork * hourRate;
    }
    @Override
    public double calculateTotalPayment(){
        return calculatePayment();
    }

}