package com.codersfactory.article;

public interface ArticleService {
        ArticleDTO createArticle(ArticleDTO articleDTO);

        ArticleDTO updateArticle(ArticleDTO articleDTO);

        ArticleDTO getArticleById(Long id);

        void deleteArticle(Long id);
}
