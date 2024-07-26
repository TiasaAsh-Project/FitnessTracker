package com.indusnet.FitnessTracker.service;

import com.indusnet.FitnessTracker.model.Workout;
import java.util.List;

public interface WorkoutService {
    Workout createWorkout(Workout workout);
    List<Workout> getAllWorkouts();
    Workout getWorkoutById(String id);
    List<Workout> getUserWorkouts(String userId);
    List<Workout> getWorkoutRecommendations(String userId);
}
