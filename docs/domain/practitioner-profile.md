# Practitioner Profile

## Purpose

Represents the initial profile data we need before generating workouts.

## Core Fields

- `dateOfBirth`
- `heightCm`
- `weightKg`
- `experienceLevel`
- `trainingGoal`
- `weeklyFrequency`

## Derived Data

- `age` is not stored.
- The domain calculates `age` from `dateOfBirth` when needed.

## Domain Concepts

- `ExperienceLevel`
  - `BEGINNER`
  - `INTERMEDIATE`
  - `ADVANCED`

- `TrainingGoal`
  - `HYPERTROPHY`
  - `FAT_LOSS`
  - `STRENGTH`
  - `CONDITIONING`

## Notes

- The profile is the first business object because it provides context for future workout generation.
- The first version keeps the model intentionally small.
