package com.sparta;

public class SpartanOnSite extends Spartan implements IWaiting {
    public SpartanOnSite(String name, String address, String number) {
        super(name, address, number, 23000);
        this.setSpartanName(name);
    }


    @Override
    public void whileWaiting() {
        System.out.println("While waiting assignment they would be on the bench");
    }
}
