package com.company;

class Post implements MailSender {
    @Override
    public String createMail(String mail) {
        mail = "Создаем новое сообщение";
        return mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Отправляем созданное сообщение по почте");
    }

    @Override
    public String toString() {
        return "Post{}";
    }
}
