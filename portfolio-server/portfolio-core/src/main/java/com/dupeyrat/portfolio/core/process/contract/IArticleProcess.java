package com.dupeyrat.portfolio.core.process.contract;

import com.dupeyrat.portfolio.core.model.Article;

public interface IArticleProcess {

    public Article updateArticle(Article article);

    public Article getArticle(String id);

    public boolean deleteArticle(String id);
}
