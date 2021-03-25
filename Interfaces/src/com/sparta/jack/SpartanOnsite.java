package com.sparta.jack;

public class SpartanOnsite extends SpartanSuperclass{

    protected double pay;


    public SpartanOnsite(String spartanAddress, String spartanContactNumber, String spartanName, double pay) {
        super(spartanAddress, spartanContactNumber, spartanName, "Sparta Onsite");
        this.pay = pay;
    }

    @Override
    public void whileWaitingAssignment() {
        System.out.println("While waiting assignment they would be in bench");
    }

    public double getPay() {
        return pay;
    }

}
