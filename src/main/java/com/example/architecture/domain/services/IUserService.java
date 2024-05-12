package com.example.architecture.domain.services;

import com.example.architecture.domain.model.User;
import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User createUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}