package com.isaque.workoutengine.adapters.in.rest.practitioner;

import com.isaque.workoutengine.domain.practitioner.ExperienceLevel;
import com.isaque.workoutengine.domain.practitioner.TrainingGoal;
import io.micronaut.serde.annotation.Serdeable;
import java.time.LocalDate;

@Serdeable.Deserializable
public record RegisterPractitionerProfileRequestDto(
				LocalDate dateOfBirth,
				double heightCm,
				double weightKg,
				ExperienceLevel experienceLevel,
				TrainingGoal trainingGoal,
				int weeklyFrequency
) {
}