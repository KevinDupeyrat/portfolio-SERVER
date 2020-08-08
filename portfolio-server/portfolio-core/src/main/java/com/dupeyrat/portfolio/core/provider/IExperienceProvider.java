package com.dupeyrat.portfolio.core.provider;

import com.dupeyrat.portfolio.core.model.Experience;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienceProvider extends MongoRepository<Experience, String> {
}
