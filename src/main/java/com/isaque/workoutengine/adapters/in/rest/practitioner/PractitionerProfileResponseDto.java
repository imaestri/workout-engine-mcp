package com.isaque.workoutengine.adapters.in.rest.practitioner;

import com.isaque.workoutengine.domain.practitioner.ExperienceLevel;
import com.isaque.workoutengine.domain.practitioner.TrainingGoal;
import io.micronaut.core.annotation.Introspected;

import java.time.LocalDate;
import java.util.UUID;

@Introspected
public record PractitionerProfileResponseDto(
				UUID id,
				LocalDate dateOfBirth,
				int age,
				double heightCm,
				double weightKg,
				ExperienceLevel experienceLevel,
				TrainingGoal trainingGoal,
				int weeklyFrequency
) {
}
