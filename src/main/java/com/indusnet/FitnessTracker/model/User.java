// package com.indusnet.FitnessTracker.model;

// import org.springframework.data.mongodb.core.mapping.Document;

// import jakarta.validation.constraints.NotBlank;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Document(collection = "users")
// @Data
// @Builder
// @NoArgsConstructor
// @AllArgsConstructor
// public class Exercise {
	
// 	private String id;
// 	private String name;
	
// 	@NotBlank(message = "Email cannot be empty")
// 	private String email;
	
// 	@NotBlank(message = "Password cannot be empty")
// 	private String password;
// 	private Long phone;
// 	private Long dateCreated;
// }




package com.indusnet.FitnessTracker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String fitnessGoal;
    private String activityPreference;

    // Getters and setters
}
