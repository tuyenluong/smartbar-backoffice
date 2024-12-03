package org.smartbar.articles;

import vn.jeremy.smartbar.backoffice.api.ArticlesApi;
import vn.jeremy.smartbar.backoffice.model.Article;

import java.util.List;

public class ArticlesController implements ArticlesApi {
    @Override
    public void articlesArticleIdDelete(String articleId) {
    }

    @Override
    public Article articlesArticleIdGet(String articleId) {
        return null;
    }

    @Override
    public void articlesArticleIdPut(String articleId, Article article) {

    }

    @Override
    public List<Article> articlesGet() {
        return List.of();
    }

    @Override
    public void articlesPost(Article article) {

    }
}
