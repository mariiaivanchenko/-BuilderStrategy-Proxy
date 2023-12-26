package ua.edu.ucu.task2.mailInfo;

import ua.edu.ucu.task2.Client;
import ua.edu.ucu.task2.MailInfo;

public interface MailInfoStrategy {
    String generateCode(MailInfo mail, Client client);
}
