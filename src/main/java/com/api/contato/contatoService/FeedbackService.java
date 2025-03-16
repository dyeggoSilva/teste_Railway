package com.api.contato.contatoService;

import com.api.contato.Dto.ContatoDTO;
import com.api.contato.Dto.FeedbackDTO;
import com.api.contato.Entities.Contato;
import com.api.contato.Entities.Feedback;
import com.api.contato.contatoRepository.FeedbackRepository;
import com.api.contato.emailService.EmailAdmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {
    @Autowired
    FeedbackRepository feedbackRepository;
    @Autowired
    EmailAdmService emailAdmService;

    public String salvaFeedback(FeedbackDTO data) {
        Feedback newFeedback = new Feedback();

        newFeedback.setNome(data.nome());
        newFeedback.setEmail(data.email());
        newFeedback.setTelefone(data.telefone());
        newFeedback.setVagaConcorrida(data.vagaConcorrida());
        newFeedback.setEmpresa(data.empresa());
        newFeedback.setFeedback(data.feedback());
        feedbackRepository.save(newFeedback);
        return emailAdmService.enviarEmailClienteFeedback(newFeedback.getEmail(), newFeedback.getNome(), newFeedback.getFeedback());
    }

}
