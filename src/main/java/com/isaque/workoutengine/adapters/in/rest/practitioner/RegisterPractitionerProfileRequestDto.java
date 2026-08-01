package com.isaque.workoutengine.adapters.in.rest.practitioner;

import com.isaque.workoutengine.domain.practitioner.ExperienceLevel;
import com.isaque.workoutengine.domain.practitioner.TrainingGoal;

import java.time.LocalDate;

public record RegisterPractitionerProfileRequestDto(
				LocalDate dateOfBirth,
				double heightCm,
				double weightKg,
				ExperienceLevel experienceLevel,
				TrainingGoal trainingGoal,
				int weeklyFrequency
) {}
