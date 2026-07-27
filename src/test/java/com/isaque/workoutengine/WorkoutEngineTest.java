package com.isaque.workoutengine;


import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import jakarta.inject.Inject;

@MicronautTest(startApplication = false)
class WorkoutEngineTest {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks() {
        assertNotNull(application);
    }

}
