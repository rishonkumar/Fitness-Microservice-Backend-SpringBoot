package com.fitnessaiservice.service;

import com.fitnessaiservice.model.Recommendation;
import com.fitnessaiservice.repository.RecommendationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendationService {


    private final RecommendationRepository recommendationRepository;

    public List<Recommendation> getUserRecommendation(String userId) {

        return recommendationRepository.findUserById(userId);
    }

    public Recommendation getActivityRecommendation(String activityId) {

        return recommendationRepository.findByActivityId(activityId)
                .orElseThrow(() -> new RuntimeException("Not activity found"));
    }
}
