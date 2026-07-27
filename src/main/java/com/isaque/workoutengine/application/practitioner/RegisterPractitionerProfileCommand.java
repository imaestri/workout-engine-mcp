package com.isaque.workoutengine.application.practitioner;

import com.isaque.workoutengine.domain.practitioner.ExperienceLevel;
import com.isaque.workoutengine.domain.practitioner.TrainingGoal;
import java.time.LocalDate;

public record RegisterPractitionerProfileCommand(
				LocalDate dateOfBirth,
				double heightCm,
				double weightKg,
				ExperienceLevel experienceLevel,
				TrainingGoal trainingGoal,
				int weeklyFrequency
) {
}