package com.qarout.conference.service;

import java.util.*;
import javax.transaction.Transactional;

import com.qarout.conference.model.Course;
import com.qarout.conference.model.Registration;
import com.qarout.conference.model.RegistrationReport;
import com.qarout.conference.respository.CourseRepository;
import com.qarout.conference.respository.RegistrationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService
{
    @Autowired
    private RegistrationRepository registrationRepository;
    @Autowired
    private CourseRepository courseRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration) {
        registration = registrationRepository.addRegistration(registration);
        Course course = new Course();
        course.setCourseName("Intro");
        course.setDescription("Every attendee ust complete the intro");
        course.setRegistration(registration);

        courseRepository.save(course);

        return  registration;
    }

    @Override
    public List<Registration> findAll()
    {
        return registrationRepository.findAll();
    }

    @Override
    public List<RegistrationReport> findAllReports()
    {
        return registrationRepository.findAllReports();
    }
}
