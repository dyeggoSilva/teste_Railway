package com.api.contato.contatoService;

import com.api.contato.Dto.ContatoDTO;
import com.api.contato.Entities.Contato;
import com.api.contato.contatoRepository.ContatoRepository;
import com.api.contato.emailService.EmailAdmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {
    @Autowired
    ContatoRepository contatoRepository;

    @Autowired
    private EmailAdmService emailAdmService;

    public String salvaContato(ContatoDTO data){
        Contato newContato = new Contato();

        newContato.setNome(data.nome());
        newContato.setEmail(data.email());
        newContato.setTelefone(data.telefone());
        newContato.setMenssagem(data.menssagem());
        contatoRepository.save(newContato);



        return emailAdmService.enviarEmailCliente(newContato.getEmail(), newContato.getNome(), newContato.getMenssagem());

    }
    public List<Contato> listAll(){
        return contatoRepository.findAll();
    }

}
