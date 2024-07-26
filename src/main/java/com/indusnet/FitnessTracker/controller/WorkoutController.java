package com.indusnet.FitnessTracker.controller;

import com.indusnet.FitnessTracker.model.Workout;
import com.indusnet.FitnessTracker.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {
    @Autowired
    private WorkoutService workoutService;

    @PostMapping
    public Workout createWorkout(@RequestBody Workout workout) {
        return workoutService.createWorkout(workout);
    }

    @GetMapping
    public List<Workout> getAllWorkouts() {
        return workoutService.getAllWorkouts();
    }

    @GetMapping("/{id}")
    public Workout getWorkoutById(@PathVariable String id) {
        return workoutService.getWorkoutById(id);
    }

    @GetMapping("/recommendations")
    public List<Workout> getWorkoutRecommendations(@RequestParam String userId) {
        // Placeholder for the algorithm to suggest workouts
        return workoutService.getUserWorkouts(userId);
    }
}
