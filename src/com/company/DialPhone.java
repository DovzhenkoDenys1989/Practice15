package com.company;

public class DialPhone extends Phone implements Caller {
    private String hasAnswerphone;

    @Override
    public void call() {
        System.out.println("Поднимаем трубку, набираем номер, звоним");
    }

    @Override
    void powerOn() {
        System.out.println("Подключаем стационарный телефон к сети");
    }

    @Override
    void powerOff() {
        System.out.println("Отключаем стационарный телефон из сети");
    }

    void autoAnswer() {
        System.out.println("Записываем пропущенный звонок на автоответчик");

    }

    @Override
    public String toString() {
        return "DialPhone{" +
                "hasAnswerphone='" + hasAnswerphone + '\'' +
                "} " + super.toString();
    }
}
