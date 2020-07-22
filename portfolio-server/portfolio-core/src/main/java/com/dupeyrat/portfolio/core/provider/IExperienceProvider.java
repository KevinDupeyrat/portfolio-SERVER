package com.dupeyrat.portfolio.core.provider;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IExperienceProvider extends MongoRepository<IExperienceProvider, String> {
}
