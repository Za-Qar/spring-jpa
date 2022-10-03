package com.qarout.conference.respository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.qarout.conference.model.User;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository
{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User save(User user) {
        entityManager.persist(user);
        return user;
    }
}
