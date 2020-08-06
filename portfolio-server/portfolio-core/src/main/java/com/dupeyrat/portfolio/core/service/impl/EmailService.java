package com.dupeyrat.portfolio.core.service.impl;

import com.dupeyrat.portfolio.core.config.ApplicationProrties;
import com.dupeyrat.portfolio.core.service.contract.IEmailService;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmailService implements IEmailService {

    private final ApplicationProrties applicationProrties;
    public final JavaMailSender emailSender;

    @Override
    public void sendEmail(JsonObject payload) {

        // Create a Simple MailMessage.
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(applicationProrties.getMail().getLogin());
        message.setSubject("Test Simple Email from " + payload.get("name").getAsString());
        message.setText("Here his message : " + payload.get("message").getAsString());

        // Send Message!
        this.emailSender.send(message);

        // Reply to sender
        message.setTo(payload.get("email").toString());
        message.setSubject("Test Simple Email from " + applicationProrties.getMail().getLogin());
        message.setText("Your massage has been send successfully.");

        // Send Message!
        this.emailSender.send(message);

    }
}
