package com.indusnet.FitnessTracker.service.impl;

import com.google.gson.Gson;
import com.indusnet.FitnessTracker.common.ResponseModel;
import com.indusnet.FitnessTracker.exception.CustomNotFoundException;
import com.indusnet.FitnessTracker.exception.UnprocessableException;
import com.indusnet.FitnessTracker.model.Workout;
import com.indusnet.FitnessTracker.repository.WorkoutRepository;
import com.indusnet.FitnessTracker.service.WorkoutService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Slf4j
public class WorkoutServiceImpl implements WorkoutService {
    
    @Autowired
    private Gson gson;
    
    @Autowired
    private WorkoutRepository repository;

    @Override
    public Workout createWorkout(Workout workout) {
    if (workout.getUserId() == null || workout.getUserId().isEmpty()) {
        String newUserId = generateUniqueUserId();
        workout.setUserId(newUserId);
        log.info("Generated new userId: " + newUserId); // Debug log
    }
    workout.setDateCreated(Instant.now().toEpochMilli());
    Workout savedWorkout = repository.save(workout);
    log.info("Saved workout: " + savedWorkout); // Debug log
    return savedWorkout;
}

	private String generateUniqueUserId() {
		return UUID.randomUUID().toString(); // Generate a unique userId
	}
    @Override
    public List<Workout> getAllWorkouts() {
        return repository.findAll();
    }

    @Override
    public Workout getWorkoutById(String id) {
        return repository.findById(id).orElseThrow(() -> new CustomNotFoundException("Workout not found"));
    }

    @Override
    public List<Workout> getUserWorkouts(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Workout> getWorkoutRecommendations(String userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWorkoutRecommendations'");
    }
	

}
