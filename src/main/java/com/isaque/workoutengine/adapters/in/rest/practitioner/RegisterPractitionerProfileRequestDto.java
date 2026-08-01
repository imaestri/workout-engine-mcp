package com.isaque.workoutengine.adapters.in.rest.practitioner;

import com.isaque.workoutengine.domain.practitioner.ExperienceLevel;
import com.isaque.workoutengine.domain.practitioner.TrainingGoal;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Serdeable.Deserializable
public record RegisterPractitionerProfileRequestDto(
				@NotNull LocalDate dateOfBirth,
				@DecimalMin("1.0") double heightCm,
				@DecimalMin("1.0") double weightKg,
				@NotNull ExperienceLevel experienceLevel,
				@NotNull TrainingGoal trainingGoal,
				@jakarta.validation.constraints.Min(1) int weeklyFrequency
) {
}