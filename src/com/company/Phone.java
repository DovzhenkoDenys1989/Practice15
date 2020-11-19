package com.company;

abstract class Phone extends AbstractDevice {
    public Phone(String name, int serialNumber) {
        super(name, serialNumber);
    }

    public Phone() {
    }

    abstract void call();

    @Override
    public String toString() {
        return "Phone{} " + super.toString();
    }
}
