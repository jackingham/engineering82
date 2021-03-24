package com.sparta.jack;

public class Main {

    public static void main(String[] args) {
	// write your code here#
        SpartanTrainee st1 = new SpartanTrainee("10 Downing Street","0800001066","Jack Ingham");
        System.out.println(st1.getSpartanName());
        System.out.println(st1.getPay());
        st1.whileWaitingAssignment();

        SpartanOnsite so = new SpartanOnsite("11 Downing Street","0800001067", 20000,"Bobby Bobson");
        System.out.println(so.getSpartanName());
        System.out.println(so.getPay());
        so.whileWaitingAssignment();
    }
}
