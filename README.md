# Workout Engine

Workout Engine is a learning project for building a real backend with Java and Micronaut using Hexagonal Architecture and Clean Architecture.

The first feature is the registration of a practitioner profile.

## Current Structure

```mermaid
flowchart TD
    subgraph IN[Inbound / REST]
        REQ[RegisterPractitionerProfileRequestDto]
        CTRL[PractitionerProfileController]
        RES[RegisterPractitionerProfileResponseDto]
    end

    subgraph APP[Application]
        SVC[RegisterPractitionerProfileService]
    end

    subgraph DOM[Domain]
        PROFILE[PractitionerProfile]
        LEVEL[ExperienceLevel]
        GOAL[TrainingGoal]
    end

    subgraph OUT[Outbound / Persistence]
        PORT[PractitionerProfileRepository]
        MEM[InMemoryPractitionerProfileRepository]
    end

    REQ --> CTRL --> SVC --> PROFILE --> PORT --> MEM
    MEM --> PORT --> RES
```

## Documentation

- [Domain notes](docs/domain/practitioner-profile.md)
- [Use case notes](docs/use-cases/register-practitioner-profile.md)
- [Architecture decisions](docs/decisions/0001-profile-first.md)

