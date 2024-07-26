package com.indusnet.FitnessTracker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "progress")
public class Progress {

    @Id
    private String id;
    private String userId;  // Ensure this field is present
    private LocalDate date;
    private int completedWorkouts;
    private double totalHoursWorkedOut;
    private double caloriesBurned;
    private double distanceCovered;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getCompletedWorkouts() {
        return completedWorkouts;
    }

    public void setCompletedWorkouts(int completedWorkouts) {
        this.completedWorkouts = completedWorkouts;
    }

    public double getTotalHoursWorkedOut() {
        return totalHoursWorkedOut;
    }

    public void setTotalHoursWorkedOut(double totalHoursWorkedOut) {
        this.totalHoursWorkedOut = totalHoursWorkedOut;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public double getDistanceCovered() {
        return distanceCovered;
    }

    public void setDistanceCovered(double distanceCovered) {
        this.distanceCovered = distanceCovered;
    }
}
