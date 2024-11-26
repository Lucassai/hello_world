package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!!!";
    }
    @GetMapping("/bsm")
    public String listaBSM(){
        return """
                Mentalidades:\s
                Orientação ao futuro
                Responsabilidade Pessoal
                Mentalidade de crescimento
                Persistência
                
                Habilidade:
                Trabalho em equipe
                Atenção aos detalhes
                Proatividade
                Comunicação""";
    }
    @GetMapping("/obj")
    public String objetivos(){
        return "Meus objetivos são conseguir uma boa vaga de emprego em uma empresa " +
                "boa que tenha oportunidades de crescimento e aprendizagem.";
    }
}
