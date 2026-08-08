package com.isaque.workoutengine.application.practitioner;

import com.isaque.workoutengine.domain.practitioner.PractitionerProfile;
import com.isaque.workoutengine.ports.out.practitioner.PractitionerProfileRepository;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Singleton;
import io.micronaut.http.HttpStatus;
import java.util.UUID;

@Singleton
public class GetPractitionerProfileByIdService implements GetPractitionerProfileByIdUseCase {

	private final PractitionerProfileRepository repository;

	public GetPractitionerProfileByIdService(PractitionerProfileRepository repository) {
		this.repository = repository;
	}

	@Override
	public PractitionerProfile getById(UUID id) {
		return repository.findById(id)
						.orElseThrow(() -> new HttpStatusException(HttpStatus.NOT_FOUND, "Practitioner profile not found"));
	}
}