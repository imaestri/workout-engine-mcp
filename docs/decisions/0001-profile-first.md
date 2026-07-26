# 0001 - Start With Practitioner Profile

## Decision

The first feature will be the registration of a practitioner profile.

## Why

- It creates the context needed for future workout generation.
- It is small enough to implement cleanly.
- It gives us a good first vertical slice through the architecture.

## Consequences

- We model `dateOfBirth` instead of `age`.
- We keep the first domain scope focused on profile data only.
- We can add workout generation later without redesigning the foundation.
