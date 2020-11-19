package com.company;

class Multicooker2 extends Multicooker {
    public Multicooker2(String name, int serialNumber) {
        super(name, serialNumber);
    }

    @Override
    void cook() {
        System.out.println("Втыкаем вилку в розетку, мультиварка включается. Начинаем готовить");
    }

    void switchProgram(int speed) {
        speed = 5;
        System.out.println("Включаем мультиварку на " + speed + " скорость");
    }

    @Override
    public String toString() {
        return "Multicooker2{} " + super.toString();
    }
}
