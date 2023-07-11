package com.codersfactory.article;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    Page<Article> findAll(Specification<Article> specs,
                          Pageable pageable);

}    interface Specs {
        static Specification<Article> byTitle(String title) {
            return (root, query, builder) -> builder.like(root.get("title"), "%" + title + "%");
        }

        static Specification<Article> byAuthor(String author) {
            return (root, query, builder) -> builder.like(root.get("author"), "%" + author + "%");
        }

        static Specification<Article> byTechnology(String technology) {
            return (root, query, builder) -> builder.like(root.get("technology"), "%" + technology + "%");
        }

        static Specification<Article> byDifficultyLevel(String difficultyLevel) {
            return (root, query, builder) -> builder.like(root.get("difficultyLevel"), "%" + difficultyLevel + "%");
        }

        static Specification<Article> byTag(String tag) {
            return (root, query, builder) -> builder.like(root.get("tag"), "%" + tag + "%");
        }

        static Specification<Article> byTags (List <String> tags) {
            return (root, query, builder) -> builder.like(root.get("tags"), "%" + tags + "%");
        }

        static Specification<Article> byTitleAndAuthor(String title, String author) {
            return (root, query, builder) -> builder.and(
                    builder.like(root.get("title"), "%" + title + "%"),
                    builder.like(root.get("author"), "%" + author + "%")
            );
        }

        static Specification<Article> queryBuilder(String title, String author, String technology, String difficultyLevel, List<String> tags) {
            return (root, query, builder) -> builder.and(
                    builder.like(root.get("title"), "%" + title + "%"),
                    builder.like(root.get("author"), "%" + author + "%"),
                    builder.like(root.get("technology"), "%" + technology + "%"),
                    builder.like(root.get("difficultyLevel"), "%" + difficultyLevel + "%"),
                    builder.like(root.get("tags"), "%" + tags + "%")
            );
        }
    }
}
