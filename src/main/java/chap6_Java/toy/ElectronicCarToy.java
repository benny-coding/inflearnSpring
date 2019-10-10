package chap6_Java.toy;

import chap6_Java.battery.*;

public class ElectronicCarToy {

    private Battery battery;

    public ElectronicCarToy(){
        battery = new NomalBattery();
    }
}
