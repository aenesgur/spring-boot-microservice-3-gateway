package com.aeg.springbootmicroservice3gateway.service;

import com.aeg.springbootmicroservice3gateway.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    User saveUser(User user);

    Optional<User> findBUsername(String username);

    List<User> findAllUsers();
}
