package mailsender.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import mailsender.app.models.Sender;

@Service
public class EmailService {

    public String sendEmail(Sender sender) {
    	return null;
    }
}