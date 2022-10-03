package com.qarout.conference.respository;

import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.qarout.conference.model.Registration;

import org.springframework.stereotype.Repository;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository
{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Registration addRegistration(Registration registration) {
        entityManager.persist(registration);
        return registration;
    }

    @Override
    public List<Registration> findAll()
    {
        List<Registration> registrations = entityManager.createQuery("Select r from Registration r").getResultList();
        return registrations;
    }
}
