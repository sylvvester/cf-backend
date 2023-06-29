package com.codersfactory.tag;

import java.util.List;

public interface TagService {
    TagResponse create(TagRequest tagRequest);

    List<Tag> getAll();
}
