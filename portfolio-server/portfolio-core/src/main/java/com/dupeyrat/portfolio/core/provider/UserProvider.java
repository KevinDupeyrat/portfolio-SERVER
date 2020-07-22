package com.dupeyrat.portfolio.core.provider;

import com.dupeyrat.portfolio.core.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProvider extends MongoRepository<User, String> {
}
