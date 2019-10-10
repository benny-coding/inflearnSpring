package chap6_Java.toy;

import chap6_Java.battery.Battery;

public class ElectronicRadioToy {

    private Battery battery;

    public ElectronicRadioToy(Battery battery){
        this.battery = battery;
    }

    public void setBattery(Battery battery){
        this.battery = battery;
    }
}
