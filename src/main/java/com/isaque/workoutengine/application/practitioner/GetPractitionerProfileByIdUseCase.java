package com.isaque.workoutengine.application.practitioner;

import com.isaque.workoutengine.domain.practitioner.PractitionerProfile;
import java.util.UUID;

public interface GetPractitionerProfileByIdUseCase {
	PractitionerProfile getById(UUID id);
}