package com.github.soulaway.springsite.service;

import com.github.soulaway.springsite.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
