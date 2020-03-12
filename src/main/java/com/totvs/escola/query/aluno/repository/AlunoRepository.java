package com.totvs.escola.query.aluno.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, String> {

	Optional<Aluno> getByCpf(String cpf);
}