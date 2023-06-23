package com.codersfactory.article;

import com.codersfactory.common.entity.DifficultyLevel;
import com.codersfactory.quiz.Quiz;
import com.codersfactory.task.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Table(name= "articles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private Long creatorId;

    private String title;

    private String content;

    private String technology;

    private DifficultyLevel difficultyLevel;

    private Instant createdAt;

    private Instant updatedAt;

    @OneToMany(mappedBy = "articleId")
    private Set<Quiz> quizzes = new HashSet<>();

    @OneToMany(mappedBy = "articleId")
    private Set<Task> tasks = new HashSet<>();

    @ElementCollection
    private Set<String> tags = new HashSet<>();

}
