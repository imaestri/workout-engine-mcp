package com.isaque.workoutengine.ports.out.practitioner;

import com.isaque.workoutengine.domain.practitioner.PractitionerProfile;

import java.util.Optional;
import java.util.UUID;

public interface PractitionerProfileRepository {

    PractitionerProfile save(PractitionerProfile profile);

    Optional<PractitionerProfile> findById(UUID id);
}
