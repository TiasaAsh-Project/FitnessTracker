package com.indusnet.FitnessTracker.repository;

import com.indusnet.FitnessTracker.model.Progress;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProgressRepository extends MongoRepository<Progress, String> {
    // Custom queries if needed
     List<Progress> findByUserId(String userId);
}
