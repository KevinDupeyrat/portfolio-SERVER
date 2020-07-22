package com.dupeyrat.portfolio.core.service.contract;

import com.dupeyrat.portfolio.core.model.Article;

public interface IArticleService {

    public Article updateArticle(Article article);

    public Article getArticle(String id);

    public boolean deleteArticle(String id);
}
