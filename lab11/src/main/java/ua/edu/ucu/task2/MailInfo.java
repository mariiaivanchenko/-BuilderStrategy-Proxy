package ua.edu.ucu.task2;

import com.mailjet.client.transactional.TransactionalEmail.TransactionalEmailBuilder;

import ua.edu.ucu.task2.mailInfo.MailInfoStrategy;

public class MailInfo {
    public Client client;
    public String mailCode;
    private String mailTheme;
    private MailInfoStrategy strategy;

    public MailInfo(Client client, MailInfoStrategy mailStrategy, String theme) {
        this.client = client;
        this.mailTheme = theme;
        this.strategy = mailStrategy;
        this.mailCode = this.strategy.generateCode(this, client);
    }

    public TransactionalEmailBuilder mailCode(String string) {
        return null;
    }
}
