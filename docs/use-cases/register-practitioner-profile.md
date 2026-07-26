# Register Practitioner Profile

## Goal

Collect and persist the initial profile of a practitioner.

## Input

- `dateOfBirth`
- `heightCm`
- `weightKg`
- `experienceLevel`
- `trainingGoal`
- `weeklyFrequency`

## Output

- `id`
- `dateOfBirth`
- `age`
- `heightCm`
- `weightKg`
- `experienceLevel`
- `trainingGoal`
- `weeklyFrequency`

## Rules

- `age` must be derived from `dateOfBirth`.
- The use case should stay independent from REST and persistence details.
- The first implementation will use an in-memory persistence adapter.

## Scope

- Create the profile
- Validate the basic input
- Save the profile through a port
