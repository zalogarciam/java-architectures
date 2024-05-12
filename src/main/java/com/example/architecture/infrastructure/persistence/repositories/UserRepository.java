package com.example.architecture.infrastructure.persistence.repositories;
import com.example.architecture.domain.model.User;
import com.example.architecture.domain.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;
@Repository
public abstract class UserRepository implements IUserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findAllById(Iterable<Long> ids) {
        return userRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void delete(User entity) {
        userRepository.delete(entity);
    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {
        userRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }

    @Override
    public <S extends User> S save(S entity) {
        return userRepository.save(entity);
    }

    @Override
    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        return userRepository.saveAll(entities);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

}