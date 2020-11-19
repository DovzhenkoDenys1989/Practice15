package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Samsung", 31, 2, "6.0");
        mobile.powerOn();
        mobile.powerOff();
        mobile.call();
        SmartPhone smartPhone = new SmartPhone("Samsung", 31, 2, "6.0", "10");
        smartPhone.runApp();
        smartPhone.call();
        smartPhone.editMail("Производим редактирование сообщения в смартфоне");
        smartPhone.createMail("Создаем новое сообщение в смартфоне");
        smartPhone.sendMail("Отправляем сообщение через смартфон");
        DialPhone dialPhone = new DialPhone("Panasonic", 5525, "Yes");
        dialPhone.powerOn();
        dialPhone.powerOff();
        dialPhone.call();
        dialPhone.autoAnswer();
        Multicooker2 multicooker = new Multicooker2("LG", 1500);
        multicooker.switchProgram(5);
        multicooker.cook();
        Oven oven = new Oven("Power", 1000);
        oven.initTimer(10);
        oven.cook();
        Post post = new Post();
        post.createMail("Создаем новое сообщение");
        post.sendMail("Отправляем созданное сообщение");
        abstractDevice(mobile, dialPhone, smartPhone, multicooker, oven);
        mailSender(smartPhone, post);
    }

    public static void abstractDevice(AbstractDevice... abstractDevices) {
        System.out.println(Arrays.toString(abstractDevices) + " - устройства отключены");
    }

    public static void mailSender(MailSender... mailSenders) {
        System.out.println(Arrays.toString(mailSenders) + " - отправляет письма");
    }
}

//        1. Работа с абстрактными классами. Реализовать иерархию классов с полями и методами
//        1) В самом верхнем по иерархии классе (AbstractDevice) создать конструктор без
//        параметров и вызвать в нем метод powerOn() , для включения устройства при
//        создании экземпляра любого дочернего класса.
//        2) Реализовать все методы путем вывода на экран сообщений с нужными
//        действиями (для эмуляции реального поведения), например:
//        • Зажимаем кнопку включения. Мобильный телефон запускается.
//        • Подключаем стационарный телефон к сети.
//        • Втыкаем вилку в розетку, печь включается.
//        • Выбираем контакт из меню, звоним
//        • Поднимаем трубку, набираем номер, звоним.
//        • И т д
//        3) Создать Main класс в котором создать экземпляры данных классов и выполнить
//        их методы.
//        2. Работа с интерфейсами. Создать интерфейсы и реализовать их в классах.
//        1) Методы реализовать аналогично п.1.
//        2) Создать метод Main с main методом, создать и проверить работу объектов,
//        аналогично п.1
//        3. В классе Main для п.1 создать статический метод, который принимает varargs из
//        AbstractDevice, который выключает все переданные устройства. Проверить работу
//        метода, передав в него все созданные объекты в п.1
//        4. В классе Main для п.2 создать статический метод, который принимает varargs из
//        MailSender, который выполняет рассылку писем из всех источников. Проверить работу
//        метода, передав в него все созданные экземпляры классов типа SmartPhone и Post
