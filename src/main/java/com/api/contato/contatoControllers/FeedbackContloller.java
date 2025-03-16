package com.api.contato.contatoControllers;


import com.api.contato.Dto.FeedbackDTO;
import com.api.contato.contatoService.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FeedbackContloller {

    @Autowired
    FeedbackService feedbackService;
    @PostMapping("/contato/feedback")
    public Object cadastroFeedback(@RequestBody FeedbackDTO data){

        return feedbackService.salvaFeedback(data) ;
    }

}
