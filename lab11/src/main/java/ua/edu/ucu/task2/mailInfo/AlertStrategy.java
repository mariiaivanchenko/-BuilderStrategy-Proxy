package ua.edu.ucu.task2.mailInfo;

import ua.edu.ucu.task2.Client;
import ua.edu.ucu.task2.MailInfo;

public class AlertStrategy implements MailInfoStrategy{
    @Override
    public String generateCode(MailInfo mail, Client client) {
        return "Attention! "  + "You, "+ client.getName() +" , are you are in danger because the air alarm is exposed. Go to the shelter!";
    }
}
