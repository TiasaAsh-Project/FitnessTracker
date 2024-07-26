package com.indusnet.FitnessTracker.service.impl;

import com.indusnet.FitnessTracker.model.User;
import com.indusnet.FitnessTracker.repository.UserRepository;
import com.indusnet.FitnessTracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User createUser(User user) {
        // You might want to perform additional validation or processing here
        return userRepository.save(user);
    }
}
