package com.spring.valgyklos.service;

import com.spring.valgyklos.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
