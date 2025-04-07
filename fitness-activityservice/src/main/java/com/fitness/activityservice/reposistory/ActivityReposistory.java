package com.fitness.activityservice.reposistory;

import com.fitness.activityservice.model.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityReposistory extends MongoRepository<Activity,String> {
}
