package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica que é uma classe controladora
@RestController

//indica um endpoint para nossa aplicação
@RequestMapping("/hello")
public class Controller {

	@GetMapping
	public String helloworld() {
		return "Hello World";
	}

	@GetMapping("/BSM")
	public String bsm() {
		return "Persistência<br/>" + "Mentalidade de Crescimento<br/>" + "Orientação ao Futuro<br/>"
				+ "Responsabilidade Pessoal<br/>" + "Trabalho em Equipe<br/>" + "Comunicação<br/>"
				+ "Comunicação Não Violenta<br/>" + "Atenção para Detalhes<br/>" + "Proatividade";
	}

	@GetMapping("/semanal")
	public String semanal() {
		return "Aprender a usar o Banco de Dados do Spring, aprender API e avançar nos projetos";
	}

}
