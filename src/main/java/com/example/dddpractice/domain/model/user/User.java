package com.example.dddpractice.domain.model.user;

import java.util.Objects;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public final class User {

    private final UserId id;
    private UserName name;

    private User(UserId id, UserName name) {
        Objects.requireNonNull(id, "user id is required");
        Objects.requireNonNull(name, "user name is required");
        this.id = id;
        this.name = name;
    }
}
