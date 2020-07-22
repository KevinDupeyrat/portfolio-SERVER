package com.dupeyrat.portfolio.core.service.impl;

import com.dupeyrat.portfolio.core.model.Article;
import com.dupeyrat.portfolio.core.provider.IArticleProvider;
import com.dupeyrat.portfolio.core.service.contract.IArticleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ArticleServiceImpl implements IArticleService {

    // private final IArticleProvider articleProvider;

    @Override
    public Article updateArticle(Article article) {
        return null;
    }

    @Override
    public Article getArticle(String id) {
        return null;
    }

    @Override
    public boolean deleteArticle(String id) {
        return false;
    }
}
