package com.company;

class Mobile extends Phone {
    private int simCount;
    private String display;

    public Mobile(String name, int serialNumber, int simCount, String display) {
        super(name, serialNumber);
        this.simCount = simCount;
        this.display = display;
    }

    @Override
    void call() {
        System.out.println("Выбираем контакт из меню, звоним");
    }

    @Override
    void powerOn() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон запускается");
    }

    @Override
    void powerOff() {
        System.out.println("Зажимаем кнопку выключения. Мобильный телефон отключается");
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "simCount=" + simCount +
                ", display='" + display + '\'' +
                "} " + super.toString();
    }
}
