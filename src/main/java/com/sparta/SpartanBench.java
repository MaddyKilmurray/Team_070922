package com.sparta;

public class SpartanBench extends Spartan implements IWaiting {

    public SpartanBench(String name, String address, String number, double pay) {
        super(name, address, number, pay);
        this.setSpartanName(name);
    }

    @Override
    public void whileWaiting() {
        System.out.println("Awaiting Assignment");
    }
}
