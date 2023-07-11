package com.codersfactory.article;

import org.springframework.data.domain.Page;

public interface ArticleService {
        ArticleDTO createArticle(ArticleDTO articleDTO);

        ArticleDTO updateArticle(ArticleDTO articleDTO);

        ArticleDTO getArticleById(Long id);

        void deleteArticle(Long id);

        Page<ArticleDTO> searchArticle(ArticleQuery query);
}
