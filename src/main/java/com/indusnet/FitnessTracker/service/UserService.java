package com.indusnet.FitnessTracker.service;

import com.indusnet.FitnessTracker.model.User;

public interface UserService {
    User getUserById(String id);

    User createUser(User user);
}
