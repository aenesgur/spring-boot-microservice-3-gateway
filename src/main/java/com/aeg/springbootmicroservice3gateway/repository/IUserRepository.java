package com.aeg.springbootmicroservice3gateway.repository;

import com.aeg.springbootmicroservice3gateway.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long>
{
    Optional<User> findByUsername(String username);
}