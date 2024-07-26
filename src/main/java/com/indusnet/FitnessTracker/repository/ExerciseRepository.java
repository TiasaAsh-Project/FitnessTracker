package com.indusnet.FitnessTracker.repository;

import com.indusnet.FitnessTracker.model.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends MongoRepository<Exercise, String> {
}
