package com.isaque.workoutengine.application.practitioner;

import com.isaque.workoutengine.domain.practitioner.PractitionerProfile;

public interface RegisterPractitionerProfileUseCase {
    PractitionerProfile register(RegisterPractitionerProfileCommand command);
}
