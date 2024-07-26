package com.indusnet.FitnessTracker.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "exercises")
public class Exercise {
    private String name;
    private int sets;
    private int reps;
    private int duration; // Duration in seconds or minutes
}
