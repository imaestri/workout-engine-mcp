package com.isaque.workoutengine.domain.practitioner;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import java.util.UUID;

public record PractitionerProfile(
        UUID id,
        LocalDate dateOfBirth,
        double heightCm,
        double weightKg,
        ExperienceLevel experienceLevel,
        TrainingGoal trainingGoal,
        int weeklyFrequency
) {

    public PractitionerProfile {
        Objects.requireNonNull(id, "id must not be null");
        Objects.requireNonNull(dateOfBirth, "dateOfBirth must not be null");
        Objects.requireNonNull(experienceLevel, "experienceLevel must not be null");
        Objects.requireNonNull(trainingGoal, "trainingGoal must not be null");

        if (heightCm <= 0) {
            throw new IllegalArgumentException("heightCm must be greater than zero");
        }
        if (weightKg <= 0) {
            throw new IllegalArgumentException("weightKg must be greater than zero");
        }
        if (weeklyFrequency <= 0) {
            throw new IllegalArgumentException("weeklyFrequency must be greater than zero");
        }
    }

    public int ageAt(LocalDate referenceDate) {
        Objects.requireNonNull(referenceDate, "referenceDate must not be null");

        if (referenceDate.isBefore(dateOfBirth)) {
            throw new IllegalArgumentException("referenceDate must not be before dateOfBirth");
        }

        return Period.between(dateOfBirth, referenceDate).getYears();
    }

    public int ageToday() {
        return ageAt(LocalDate.now());
    }
}
