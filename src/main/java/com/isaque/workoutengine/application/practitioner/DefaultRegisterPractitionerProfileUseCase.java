package com.isaque.workoutengine.application.practitioner;

import com.isaque.workoutengine.domain.practitioner.PractitionerProfile;
import com.isaque.workoutengine.ports.out.practitioner.PractitionerProfileRepository;
import jakarta.inject.Singleton;
import java.util.UUID;

@Singleton
public class DefaultRegisterPractitionerProfileUseCase implements RegisterPractitionerProfileUseCase {

	private final PractitionerProfileRepository repository;

	public DefaultRegisterPractitionerProfileUseCase(PractitionerProfileRepository repository) {
		this.repository = repository;
	}

	@Override
	public PractitionerProfile register(RegisterPractitionerProfileCommand command) {
		var profile = new PractitionerProfile(
						UUID.randomUUID(),
						command.dateOfBirth(),
						command.heightCm(),
						command.weightKg(),
						command.experienceLevel(),
						command.trainingGoal(),
						command.weeklyFrequency()
		);

		return repository.save(profile);
	}
}