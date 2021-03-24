package com.sparta.jack;

public class SpartanOnsite extends SpartanSuperclass{


    public SpartanOnsite(String spartanAddress, String spartanContactNumber,double pay, String spartanName) {
        super(spartanAddress, spartanContactNumber, spartanName, "Sparta Onsite");
        this.pay = pay;
    }

    @Override
    public void whileWaitingAssignment() {
        System.out.println("While waiting assignment they would be in bench");
    }

}
