package com.company;

class SmartPhone extends Mobile implements Caller, EmailSender {
    private String os;

    public SmartPhone(String name, int serialNumber, int simCount, String display, String os) {
        super(name, serialNumber, simCount, display);
        this.os = os;
    }

    void runApp() {
        System.out.println("Запускаем мобильное приложение в смартфоне");
    }

    @Override
    public String editMail(String mail) {
        mail = "Производим редактирование сообщения в смартфоне";
        return mail;
    }

    @Override
    public String createMail(String mail) {
        mail = "Создаем новое сообщение в смартфоне";
        return mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Отправляем сообщение через смартфон");
    }

    @Override
    public void call() {
        System.out.println("Производим звонок из смартфона");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "os='" + os + '\'' +
                "} " + super.toString();
    }
}
