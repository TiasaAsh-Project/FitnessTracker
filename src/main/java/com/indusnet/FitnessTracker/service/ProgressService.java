package com.indusnet.FitnessTracker.service;

import java.util.List;

import com.indusnet.FitnessTracker.model.Progress;

public interface ProgressService {
    Progress createProgress(Progress progress);
     List<Progress> getProgressByUserId(String userId);
}
