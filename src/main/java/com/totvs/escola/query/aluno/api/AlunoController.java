package com.totvs.escola.query.aluno.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totvs.escola.query.aluno.exception.EscolaQueryAlunoNotFoundException;
import com.totvs.escola.query.aluno.repository.Aluno;
import com.totvs.escola.query.aluno.repository.AlunoRepository;
import com.totvs.tjf.api.context.stereotype.ApiGuideline;
import com.totvs.tjf.api.context.stereotype.ApiGuideline.ApiGuidelineVersion;

import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping(path = AlunoController.PATH, produces = { APPLICATION_JSON_VALUE })
@ApiGuideline(ApiGuidelineVersion.v1)
public class AlunoController {

	public static final String PATH = "/api/v1/alunos";

	@Autowired
	private AlunoRepository alunoRespository;

	@ApiOperation(value = "Retorna um aluno", httpMethod = "GET")
	@GetMapping(path = "/cpf/{cpf}")
	public Aluno byCpf(@PathVariable String cpf) {

		System.out.println("Teste AlunoController");

		return this.alunoRespository.getByCpf(cpf).orElseThrow(() -> new EscolaQueryAlunoNotFoundException(cpf));

	}
}