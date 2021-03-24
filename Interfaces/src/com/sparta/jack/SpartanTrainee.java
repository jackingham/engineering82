package com.sparta.jack;

public class SpartanTrainee extends SpartanSuperclass{


    public SpartanTrainee(String spartanAddress, String spartanContactNumber, String spartanName) {
        super(spartanAddress, spartanContactNumber, spartanName, "Sparta Trainee");
    }


    @Override
    public void whileWaitingAssignment() {
        System.out.println("While waiting assignment they would be in pre-assignment period/training");
    }

}
