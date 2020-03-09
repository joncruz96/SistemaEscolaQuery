package com.totvs.escola.query;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "escolaQuery", ignoreUnknownFields = true, ignoreInvalidFields = true)
public class EscolaQueryProperties {

	private SwaggerProperties swagger;

	@Data
	public static class SwaggerProperties {

		private boolean enabled;
		private Oauth2Properties oauth2;

		@Data
		static class Oauth2Properties {

			private String clientId;
			private String clientSecret;
			private String authServer;
		}
	}
}
