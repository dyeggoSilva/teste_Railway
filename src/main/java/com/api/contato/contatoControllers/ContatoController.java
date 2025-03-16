package com.api.contato.contatoControllers;

import com.api.contato.Dto.ContatoDTO;
import com.api.contato.contatoService.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContatoController {
    @Autowired
    ContatoService contatoService;
    @PostMapping("/contato/add")
    public Object cadastroCurso(@RequestBody ContatoDTO data){
        return contatoService.salvaContato(data);
    }


    @GetMapping("/contatos/users")
    public List Contato(){
        return contatoService.listAll();
    }

    @GetMapping("/ok")
    public String Statos(){
        return "conexão ok!";
    }
}
