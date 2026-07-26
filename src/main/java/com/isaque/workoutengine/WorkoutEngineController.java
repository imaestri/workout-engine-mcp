package com.isaque.workoutengine;


import io.micronaut.http.annotation.*;

@Controller("/workout-engine")
public class WorkoutEngineController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}