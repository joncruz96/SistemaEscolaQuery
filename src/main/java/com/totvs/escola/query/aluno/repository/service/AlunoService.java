package com.totvs.escola.query.aluno.repository.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totvs.escola.query.aluno.amqp.events.AlunoCriadoEvent;
import com.totvs.escola.query.aluno.repository.Aluno;
import com.totvs.escola.query.aluno.repository.AlunoRepository;

@Service
@Transactional
public class AlunoService {

	@Autowired
	private AlunoRepository repository;

	public void handle(AlunoCriadoEvent event) {

		System.out.println("AlunoService");

		Aluno aluno = Aluno.builder().id(event.getId()).nome(event.getNome()).cpf(event.getCpf())
				.email(event.getEmail()).formaIngresso(event.getFormaIngresso()).matricula(event.getMatricula())
				.build();
		repository.save(aluno);

	}
}
