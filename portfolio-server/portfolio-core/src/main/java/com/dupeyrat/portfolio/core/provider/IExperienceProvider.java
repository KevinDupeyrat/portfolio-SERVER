package com.dupeyrat.portfolio.core.provider;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienceProvider extends MongoRepository<IExperienceProvider, String> {
}
