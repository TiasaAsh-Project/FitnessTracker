package com.indusnet.FitnessTracker.service.impl;

import com.indusnet.FitnessTracker.model.Exercise;
import com.indusnet.FitnessTracker.repository.ExerciseRepository;
import com.indusnet.FitnessTracker.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService {
    @Autowired
    private ExerciseRepository exerciseRepository;
    @Override
    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }
    @Override
    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }
}
