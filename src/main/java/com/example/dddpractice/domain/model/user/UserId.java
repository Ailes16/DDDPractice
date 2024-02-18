package com.example.dddpractice.domain.model.user;

import java.util.Objects;

public final record UserId(
                String id) {
        public UserId(String id) {
                Objects.requireNonNull(id, "user id is required");
                this.id = id;
        }
}
