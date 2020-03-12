package com.totvs.escola.query.aluno.exception;

import com.totvs.tjf.api.context.stereotype.ApiErrorParameter;
import com.totvs.tjf.api.context.stereotype.error.ApiNotFound;

import lombok.Getter;

@ApiNotFound("EscolaQueryAlunoNotFoundException")
@Getter
public class EscolaQueryAlunoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 2100396918453973429L;

	@ApiErrorParameter
	private final String aluno;

	public EscolaQueryAlunoNotFoundException(String aluno) {
		this.aluno = aluno;
	}

}