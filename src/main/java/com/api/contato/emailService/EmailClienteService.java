package com.api.contato.emailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailClienteService {
    @Autowired
    private JavaMailSender javaMailSender;

}
