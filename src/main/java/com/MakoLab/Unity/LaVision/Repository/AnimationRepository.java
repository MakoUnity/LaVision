package com.MakoLab.Unity.LaVision.Repository;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.MakoLab.Unity.LaVision.Models.ActualAnimation;

public interface AnimationRepository extends MongoRepository<ActualAnimation, String>, MongoOperations {

}
