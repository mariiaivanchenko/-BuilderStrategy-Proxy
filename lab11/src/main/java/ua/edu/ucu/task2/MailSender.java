package ua.edu.ucu.task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.transactional.SendContact;
import com.mailjet.client.transactional.SendEmailsRequest;
import com.mailjet.client.transactional.TrackOpens;
import com.mailjet.client.transactional.TransactionalEmail;
import com.mailjet.client.transactional.response.SendEmailsResponse;

public class MailSender {
    private static MailjetClient client;

    public MailSender() {
        ClientOptions options = ClientOptions.builder()
                .apiKey("835bedef593a0f9946f3c223b9c96a80") // 835bedef593a0f9946f3c223b9c96a80
                .apiSecretKey("ddcba2f62ef26742a7e7f0d8685ac9c6") // ddcba2f62ef26742a7e7f0d8685ac9c6
                .build();
        MailSender.client = new MailjetClient(options);
    }

    public void sendMail(MailInfo mailInfo) {
        TransactionalEmail message1 = TransactionalEmail
                .builder()
                .to(new SendContact(mailInfo.client.getEmail(), mailInfo.client.getName()))
                .from(new SendContact("ivanchenko.pn@ucu.edu.ua", "Mariia"))
                .htmlPart("<h1>" + mailInfo.mailCode + "</h1>")
                .subject("Christmas greetings")
                .trackOpens(TrackOpens.ENABLED)
                .build();

        SendEmailsRequest request = SendEmailsRequest
                .builder()
                .message(message1)
                .build();

        try {
            SendEmailsResponse response = request.sendWith(client);
            System.out.println("Email sent successfully!");
        } catch (Exception e) {
            System.err.println("Error sending email: " + e.getMessage());
        }
    }
}

