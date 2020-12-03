package com.company;

abstract class Multicooker extends AbstractDevice {

    @Override
    void powerOn() {
        System.out.println("Нажимаем кнопку включения. Прибор включается");
    }

    @Override
    void powerOff() {
        System.out.println("Нажимаем кнопку выключения. Прибор отключается");
    }

    abstract void cook();

    @Override
    public String toString() {
        return "Multicooker{} " + super.toString();
    }
}
