package com.sparta.jack;

public abstract class SpartanSuperclass {

    protected String spartanName;
    protected String spartanAddress;
    protected String spartanContactNumber;
    protected String spartanType;

    public abstract void whileWaitingAssignment();

    public /*does this need to be protected?*/ SpartanSuperclass(String spartanAddress, String spartanContactNumber, String spartanName, String spartanType) {
        this.spartanName = spartanName;
        this.spartanAddress = spartanAddress;
        this.spartanContactNumber = spartanContactNumber;
        this.spartanType = spartanType;
    }


    public String getSpartanName() {
        return spartanName;
    }

    public String getSpartanAddress(){
        return spartanAddress;
    }

    public String getSpartanContactNumber(){
        return spartanContactNumber;
    }

    public String getSpartanType(){
        return spartanType;
    }
}


