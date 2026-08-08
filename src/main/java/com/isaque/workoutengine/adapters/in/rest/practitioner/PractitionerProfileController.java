package com.isaque.workoutengine.adapters.in.rest.practitioner;

import com.isaque.workoutengine.application.practitioner.GetPractitionerProfileByIdUseCase;
import com.isaque.workoutengine.application.practitioner.RegisterPractitionerProfileDto;
import com.isaque.workoutengine.application.practitioner.RegisterPractitionerProfileService;
import com.isaque.workoutengine.domain.practitioner.PractitionerProfile;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.validation.Validated;
import jakarta.validation.Valid;
import java.util.UUID;

@Validated
@Controller("/practitioner-profiles")
public class PractitionerProfileController {

	private final RegisterPractitionerProfileService registerPractitionerProfileService;
	private final GetPractitionerProfileByIdUseCase getPractitionerProfileByIdUseCase;

	public PractitionerProfileController(
					RegisterPractitionerProfileService registerPractitionerProfileService,
					GetPractitionerProfileByIdUseCase getPractitionerProfileByIdUseCase
	) {
		this.registerPractitionerProfileService = registerPractitionerProfileService;
		this.getPractitionerProfileByIdUseCase = getPractitionerProfileByIdUseCase;
	}

	@Post
	public HttpResponse<PractitionerProfileResponseDto> register(@Valid RegisterPractitionerProfileRequestDto requestDto) {
		var dto = toApplicationDto(requestDto);
		var profile = registerPractitionerProfileService.register(dto);

		return HttpResponse.created(toResponseDto(profile));
	}

	@Get("/{id}")
	public PractitionerProfileResponseDto getById(@PathVariable UUID id) {
		var profile = getPractitionerProfileByIdUseCase.getById(id);
		return toResponseDto(profile);
	}

	private RegisterPractitionerProfileDto toApplicationDto(RegisterPractitionerProfileRequestDto requestDto) {
		return new RegisterPractitionerProfileDto(
						requestDto.dateOfBirth(),
						requestDto.heightCm(),
						requestDto.weightKg(),
						requestDto.experienceLevel(),
						requestDto.trainingGoal(),
						requestDto.weeklyFrequency()
		);
	}

	private PractitionerProfileResponseDto toResponseDto(PractitionerProfile profile) {
		return new PractitionerProfileResponseDto(
						profile.id(),
						profile.dateOfBirth(),
						profile.ageToday(),
						profile.heightCm(),
						profile.weightKg(),
						profile.experienceLevel(),
						profile.trainingGoal(),
						profile.weeklyFrequency()
		);
	}
}