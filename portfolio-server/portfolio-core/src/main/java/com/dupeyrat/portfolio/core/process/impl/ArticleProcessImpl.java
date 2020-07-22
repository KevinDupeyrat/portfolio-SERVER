package com.dupeyrat.portfolio.core.process.impl;

import com.dupeyrat.portfolio.core.model.Article;
import com.dupeyrat.portfolio.core.process.contract.IArticleProcess;
import com.dupeyrat.portfolio.core.service.contract.IArticleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ArticleProcessImpl implements IArticleProcess {

    private final IArticleService articleService ;

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
