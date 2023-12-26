package ua.edu.ucu.task2.mailInfo;

import ua.edu.ucu.task2.Client;
import ua.edu.ucu.task2.MailInfo;

public class BirthdayStrategy implements MailInfoStrategy{
    @Override
    public String generateCode(MailInfo mail, Client client) {
        return "Happy Birthday " + client.getName() + "." + "You are already " + client.getAge() + " years old!";
    }
}
