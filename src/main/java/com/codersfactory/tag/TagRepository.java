package com.codersfactory.tag;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TagRepository extends JpaRepository<Tag, Long> {

    Optional<Object> findByValue(String lowerCase);
}
