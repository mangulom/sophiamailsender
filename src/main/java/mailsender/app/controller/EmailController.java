package mailsender.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mailsender.app.models.Sender;
import mailsender.app.service.EmailService;

@RestController
@RequestMapping("/sophia")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/email/send")
    public String sendEmail(@RequestBody Sender sender) {

        return "hola";
    }
}
