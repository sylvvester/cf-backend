package com.codersfactory.tag;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    public TagResponse create(TagRequest tagRequest) {
        tagRepository.findByValue(tagRequest.value().toLowerCase())
                .ifPresent(tag -> {
                    throw new TagAlreadyExistsException(tagRequest.value());
                });


        Tag tag = new Tag();
        tag.setValue(tagRequest.value().toLowerCase());

        tagRepository.save(tag);

        return TagResponse.builder()
                .id(tag.getId())
                .value(tag.getValue())
                .createdAt(tag.getCreatedAt())
                .build();
    }

    public List<Tag> getAll() {
        return tagRepository.findAll();
    }
}
