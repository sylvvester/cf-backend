package com.codersfactory.tag;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record TagRequest(
        @NotBlank
        @Pattern(regexp = "^[a-zA-Z0-9_]{3,30}$",
                message = "Tag value must be between 3 and 30 character " +
                        "and can contain only letters, numbers and underscore")
        String value){
}
