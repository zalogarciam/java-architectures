package com.example.architecture.domain.repositories;
import com.example.architecture.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods here if needed
}