package com.isaque.workoutengine.adapters.out.memory.practitioner;

import com.isaque.workoutengine.domain.practitioner.PractitionerProfile;
import com.isaque.workoutengine.ports.out.practitioner.PractitionerProfileRepository;
import jakarta.inject.Singleton;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Singleton
public class InMemoryPractitionerProfileRepository implements PractitionerProfileRepository {
	private final Map<UUID, PractitionerProfile> storage = new ConcurrentHashMap<>();

	@Override
	public PractitionerProfile save(PractitionerProfile profile) {
		storage.put(profile.id(), profile);
		return profile;
	}

	@Override
	public Optional<PractitionerProfile> findById(UUID id) {
		return Optional.ofNullable(storage.get(id));
	}
}
