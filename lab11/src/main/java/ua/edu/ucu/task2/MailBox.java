package ua.edu.ucu.task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();
    private MailSender sender;

    public MailBox() {
        this.sender = new MailSender();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo elem : infos) {
            sender.sendMail(elem);
        }
    }
}
