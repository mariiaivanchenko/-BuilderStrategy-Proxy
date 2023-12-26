package ua.edu.ucu.task2;

import ua.edu.ucu.task2.mailInfo.ChristmasStrategy;

public class Main {
    public static void main(String[] args) {
        MailBox box = new MailBox();
        Client Mariia = new Client("mariiaivanchenko027@gmail.com","Mariia",19, Sex.FEMALE );
        MailInfo info1 = new MailInfo(Mariia, new ChristmasStrategy(),"First Try");
        box.addMailInfo(info1);
        box.sendAll();
    }
}
