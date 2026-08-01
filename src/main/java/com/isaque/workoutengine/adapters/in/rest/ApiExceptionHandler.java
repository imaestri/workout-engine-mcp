package com.isaque.workoutengine.adapters.in.rest;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.inject.Singleton;

@Singleton
@Produces
public class ApiExceptionHandler implements ExceptionHandler<IllegalArgumentException, HttpResponse<?>> {

	@Override
	public HttpResponse<?> handle(HttpRequest request, IllegalArgumentException exception) {
		return HttpResponse.status(HttpStatus.BAD_REQUEST)
						.body(new ErrorResponseDto(exception.getMessage()));
	}

	@Serdeable.Serializable
	public record ErrorResponseDto(String message) {
	}
}