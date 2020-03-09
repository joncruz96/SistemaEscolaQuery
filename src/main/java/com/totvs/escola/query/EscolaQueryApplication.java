package com.totvs.escola.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.totvs.tjf.api.jpa.repository.impl.ApiJpaRepositoryImpl;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableConfigurationProperties({ EscolaQueryProperties.class, FlyWayProperties.class })
@EnableJpaRepositories(repositoryBaseClass = ApiJpaRepositoryImpl.class)
@EnableSwagger2
public class EscolaQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaQueryApplication.class, args);
	}

}
