package com.dupeyrat.portfolio.core.service.technical.impl;

import com.dupeyrat.portfolio.core.config.ApplicationProrties;
import com.dupeyrat.portfolio.core.service.technical.contract.IEmailService;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmailService implements IEmailService {

    private final ApplicationProrties applicationProrties;

    private final JavaMailSender emailSender;

    private final MailContentBuilder mailContentBuilder;

    @Override
    public void sendEmail(JsonObject payload) {

        // Create a Mime Message.
        MimeMessagePreparator messagePreparator = mimeMessage -> {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
            messageHelper.setFrom(applicationProrties.getMail().getLogin());
            messageHelper.setTo(applicationProrties.getMail().getLogin());
            messageHelper.setSubject("Test Simple Email from " + payload.get("name").getAsString());
            String content = mailContentBuilder.build("Here his message : " + payload.get("message").getAsString());
            messageHelper.setText(content, true);
        };

        // Send Message!
        this.emailSender.send(messagePreparator);

       sendResponseMail(payload);

    }

    private void sendResponseMail(JsonObject payload) {

        // Create a Mime Message.
        MimeMessagePreparator messagePreparator = mimeMessage -> {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
            messageHelper.setFrom(applicationProrties.getMail().getLogin());
            messageHelper.setTo(payload.get("email").toString());
            messageHelper.setSubject("Test Simple Email from " + applicationProrties.getMail().getLogin());
            String content = mailContentBuilder.build("Your massage has been send successfully.");
            messageHelper.setText(content, true);
        };


        // Send Message!
        this.emailSender.send(messagePreparator);
    }
}
