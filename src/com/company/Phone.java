package com.company;

abstract class Phone extends AbstractDevice {

    public Phone() {
    }

    abstract void call();

    @Override
    public String toString() {
        return "Phone{} " + super.toString();
    }
}
