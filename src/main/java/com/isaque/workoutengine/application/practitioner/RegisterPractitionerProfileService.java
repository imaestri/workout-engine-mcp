package com.isaque.workoutengine.application.practitioner;

import com.isaque.workoutengine.domain.practitioner.PractitionerProfile;
import com.isaque.workoutengine.ports.out.practitioner.PractitionerProfileRepository;
import jakarta.inject.Singleton;
import java.util.UUID;

@Singleton
public class RegisterPractitionerProfileService implements RegisterPractitionerProfileUseCase {

    private final PractitionerProfileRepository repository;

    public RegisterPractitionerProfileService(PractitionerProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public PractitionerProfile register(RegisterPractitionerProfileDto dto) {
        var profile = new PractitionerProfile(
                UUID.randomUUID(),
                dto.dateOfBirth(),
                dto.heightCm(),
                dto.weightKg(),
                dto.experienceLevel(),
                dto.trainingGoal(),
                dto.weeklyFrequency()
        );

        return repository.save(profile);
    }
}
