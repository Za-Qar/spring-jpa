package com.qarout.conference.respository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.qarout.conference.model.Course;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepositoryImpl implements CourseRepository
{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Course save(Course course) {
        entityManager.persist(course);
        return course;
    }
}
