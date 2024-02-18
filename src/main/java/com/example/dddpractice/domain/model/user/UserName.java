package com.example.dddpractice.domain.model.user;

import java.util.Objects;

public final record UserName(
                String name) {
        public UserName(String name) {
                Objects.requireNonNull(name, "user name is required");
                this.name = name;
        }
}
