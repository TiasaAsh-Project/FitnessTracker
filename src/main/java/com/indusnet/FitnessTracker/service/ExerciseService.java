package com.indusnet.FitnessTracker.service;

import com.indusnet.FitnessTracker.model.Exercise;
import java.util.List;

public interface ExerciseService {
    List<Exercise> getAllExercises();

    Exercise createExercise(Exercise exercise);
}
