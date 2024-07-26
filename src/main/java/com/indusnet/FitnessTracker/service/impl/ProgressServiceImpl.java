package com.indusnet.FitnessTracker.service.impl;

import com.indusnet.FitnessTracker.model.Progress;
import com.indusnet.FitnessTracker.repository.ProgressRepository;
import com.indusnet.FitnessTracker.service.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID; // For generating a unique ID

@Service
public class ProgressServiceImpl implements ProgressService {

    @Autowired
    private ProgressRepository progressRepository;

    @Override
    public Progress createProgress(Progress progress) {
        // Generate userId if not present
        if (progress.getUserId() == null || progress.getUserId().trim().isEmpty()) {
            progress.setUserId(UUID.randomUUID().toString()); // Generates a unique ID
        }
        return progressRepository.save(progress);
    }
    @Override
    public List<Progress> getProgressByUserId(String userId) {
        return progressRepository.findByUserId(userId);
    }
}
