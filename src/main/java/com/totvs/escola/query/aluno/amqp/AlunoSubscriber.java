package com.totvs.escola.query.aluno.amqp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.totvs.escola.query.EscolaExchange;
import com.totvs.escola.query.aluno.amqp.events.AlunoCriadoEvent;
import com.totvs.escola.query.aluno.repository.service.AlunoService;
import com.totvs.tjf.core.message.TOTVSMessage;

@EnableBinding(EscolaExchange.class)
public class AlunoSubscriber {

	@Autowired
	private AlunoService service;

	@StreamListener(target = EscolaExchange.INPUT, condition = AlunoCriadoEvent.CONDITIONAL_EXPRESSION)
	public void alunoCriadoEvent(TOTVSMessage<AlunoCriadoEvent> event) {

		System.out.println("AlunoSubscriber");

		service.handle(event.getContent());
	}
}