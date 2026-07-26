package com.isaque.workoutengine.domain.practitioner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class PractitionerProfileTest {

    @Test
    void shouldCalculateAgeFromDateOfBirth() {
        var profile = new PractitionerProfile(
                UUID.randomUUID(),
                LocalDate.of(2000, 7, 26),
                180.0,
                80.0,
                ExperienceLevel.BEGINNER,
                TrainingGoal.HYPERTROPHY,
                3
        );

        assertEquals(26, profile.ageAt(LocalDate.of(2026, 7, 26)));
    }

    @Test
    void shouldRejectInvalidHeight() {
        assertThrows(IllegalArgumentException.class, () -> new PractitionerProfile(
                UUID.randomUUID(),
                LocalDate.of(2000, 1, 1),
                0.0,
                80.0,
                ExperienceLevel.BEGINNER,
                TrainingGoal.HYPERTROPHY,
                3
        ));
    }

    @Test
    void shouldRejectReferenceDateBeforeBirthDate() {
        var profile = new PractitionerProfile(
                UUID.randomUUID(),
                LocalDate.of(2000, 1, 1),
                180.0,
                80.0,
                ExperienceLevel.BEGINNER,
                TrainingGoal.HYPERTROPHY,
                3
        );

        assertThrows(IllegalArgumentException.class, () -> profile.ageAt(LocalDate.of(1999, 12, 31)));
    }
}
