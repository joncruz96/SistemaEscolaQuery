package com.totvs.escola.query.aluno.amqp.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AlunoCriadoEvent {

	public static final String NAME = "AlunoCriadoEvent";

	public static final String CONDITIONAL_EXPRESSION = "headers['type']=='" + NAME + "'";

	@NonNull
	private String id;

	@NonNull
	private String formaIngresso;

	@NonNull
	private String matricula;

	@NonNull
	private String cpf;

	@NonNull
	private String nome;

	@NonNull
	private String email;
}