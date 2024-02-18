package com.example.dddpractice.domain.model.user;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(UserId id);
}
