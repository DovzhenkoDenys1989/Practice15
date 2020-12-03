package com.company;

abstract class AbstractDevice {
    private String name;
    private int serialNumber;

    abstract void powerOn();

    abstract void powerOff();

    public AbstractDevice() {
        powerOn();
    }

    @Override
    public String toString() {
        return "AbstractDevice{" +
                "name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
