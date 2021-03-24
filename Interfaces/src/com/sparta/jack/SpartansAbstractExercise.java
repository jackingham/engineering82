package com.sparta.jack;
//Please work on this and suggest an alternative if you find a flaw in it

public class SpartansAbstractExercise {
    private String spartanName;
    private String spartanAddress;
    private int spartanContactNumber;
    private double pay;
    //tag field
    private String spartanType;

    public SpartansAbstractExercise(String spartanAddress, int spartanContactNumber, String spartanType) {
        //this.spartanName = spartanName;
        this.spartanAddress = spartanAddress;
        this.spartanContactNumber = spartanContactNumber;
        this.spartanType = "Sparta Trainee";
    }

    public SpartansAbstractExercise(String spartanName, String spartanAddress, int spartanContactNumber, double pay, String spartanType) {
        this.spartanName = spartanName;
        this.spartanAddress = spartanAddress;
        this.spartanContactNumber = spartanContactNumber;
        this.pay = pay;
        this.spartanType = "Sparta Onsite";
    }

    public void whileWaitingAssignment(){
        if (spartanType.equalsIgnoreCase(" Spartan Trainee")){
            System.out.println("While waiting assignment they would be in pre-assignment period/training");
        }
        else if(spartanType.equalsIgnoreCase("Spartan Onsite")){
            System.out.println("While waiting assignment they would be in bench");
        }

    }

    public double getPay() {
        return pay;
    }

    public String getSpartanName() {
        return spartanName;
    }
}
