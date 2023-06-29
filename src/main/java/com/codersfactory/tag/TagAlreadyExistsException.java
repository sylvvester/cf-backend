package com.codersfactory.tag;

public class TagAlreadyExistsException extends RuntimeException {
    public TagAlreadyExistsException(String value) {
        super("Tag '" + value + "' already exists");
    }
}
