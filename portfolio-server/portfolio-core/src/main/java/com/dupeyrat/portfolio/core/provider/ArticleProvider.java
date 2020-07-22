package com.dupeyrat.portfolio.core.provider;

import com.dupeyrat.portfolio.core.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleProvider extends MongoRepository<Article, String> {
}
