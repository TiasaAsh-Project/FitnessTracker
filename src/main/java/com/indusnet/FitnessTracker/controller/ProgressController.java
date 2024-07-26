package com.indusnet.FitnessTracker.controller;

import com.indusnet.FitnessTracker.model.Progress;
import com.indusnet.FitnessTracker.service.ProgressService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class ProgressController {

    @Autowired
    private ProgressService progressService;

    @PostMapping("/progress")
    public ResponseEntity<Progress> createProgress(@RequestBody Progress progress) {
        Progress createdProgress = progressService.createProgress(progress);
        return ResponseEntity.status(201).body(createdProgress);
    }
@GetMapping("/{id}/progress")
    public ResponseEntity<List<Progress>> getProgressByUserId(@PathVariable("id") String userId) {
        List<Progress> progressList = progressService.getProgressByUserId(userId);
        if (progressList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(progressList);
    }
    // Other endpoints if needed
}
