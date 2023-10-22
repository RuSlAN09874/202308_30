package org.example.homeWork.company;

public class DesingTask extends Task {
    private int numberDesing;
    private double disingRete;

    public DesingTask(int numberDesing, double disingRete) {
        this.numberDesing = numberDesing;
        this.disingRete = disingRete;
    }

    @Override
    public double calculateTotalPayment(){
        return numberDesing * disingRete;
    }
}
