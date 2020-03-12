package com.totvs.escola.query;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface EscolaExchange {

	public static final String INPUT = "escola-input-events";

	@Input(EscolaExchange.INPUT)
	SubscribableChannel input();
}