package com.sparta;

public class SpartanTrainee extends Spartan implements IWaiting {
    public SpartanTrainee(String name, String address, String number) {
        super(name, address, number, 0);
        this.setSpartanName(name);
    }

    @Override
    public void whileWaiting() {
        System.out.println("While waiting assignment they would be in pre-assignment period/training");
    }
}
