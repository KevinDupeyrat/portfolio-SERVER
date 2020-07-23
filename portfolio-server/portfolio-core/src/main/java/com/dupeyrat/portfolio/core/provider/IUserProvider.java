package com.dupeyrat.portfolio.core.provider;

import com.dupeyrat.portfolio.core.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserProvider extends MongoRepository<User, String> {
}
