CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE aluno
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nome character varying(255) COLLATE pg_catalog."default",
    cpf character varying(255) COLLATE pg_catalog."default" NOT NULL,
    email character varying(255) COLLATE pg_catalog."default" NOT NULL,
	forma_ingresso character varying(255) COLLATE pg_catalog."default" NOT NULL,
    matricula character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT aluno_pkey PRIMARY KEY (id)
);

CREATE INDEX idx1_aluno_cpf
    ON aluno USING btree
    (cpf COLLATE pg_catalog."default")
    TABLESPACE pg_default;

