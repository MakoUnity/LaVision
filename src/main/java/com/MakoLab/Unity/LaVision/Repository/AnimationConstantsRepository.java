package com.MakoLab.Unity.LaVision.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.MakoLab.Unity.LaVision.Models.AnimationConstants;

public interface AnimationConstantsRepository extends MongoRepository<AnimationConstants, String> {

}
