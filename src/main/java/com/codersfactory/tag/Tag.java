package com.codersfactory.tag;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;


import java.time.Instant;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tags", uniqueConstraints = {@UniqueConstraint(columnNames = {"value"})})
public class Tag {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String value;

    @CreationTimestamp
    private Instant createdAt;

}