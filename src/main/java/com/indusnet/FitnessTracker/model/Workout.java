package com.indusnet.FitnessTracker.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "workouts")
public class Workout {
    @Id
    private String id;
    private String userId;
    private String name;
    private String description;
    private long dateCreated; // Ensure this field is present
    private List<Exercise> exercises; // Assuming Exercise is a nested class
}
