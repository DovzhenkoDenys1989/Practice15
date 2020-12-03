package com.company;

class Oven extends Multicooker {

    @Override
    void cook() {
        System.out.println("Втыкаем вилку в розетку, печь включается. Начинаем готовить");
    }

    void initTimer(int time) {
        time = 10;
        System.out.println("Включаем печь на " + time + " минут");
    }

    @Override
    public String toString() {
        return "Oven{} " + super.toString();
    }
}
