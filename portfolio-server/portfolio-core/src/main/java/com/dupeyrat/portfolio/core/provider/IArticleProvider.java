package com.dupeyrat.portfolio.core.provider;

import com.dupeyrat.portfolio.core.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArticleProvider extends MongoRepository<Article, String> {
}
