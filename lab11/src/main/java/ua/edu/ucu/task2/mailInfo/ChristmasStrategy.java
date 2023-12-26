package ua.edu.ucu.task2.mailInfo;

import ua.edu.ucu.task2.Client;
import ua.edu.ucu.task2.MailInfo;

public class ChristmasStrategy implements MailInfoStrategy{
    @Override
    public String generateCode(MailInfo mail, Client client) {
        return "Merry Christmas " + client.getName() + "! " + "I wish you and your family all the best!";
    }
}
