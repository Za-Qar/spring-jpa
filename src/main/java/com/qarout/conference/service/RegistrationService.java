package com.qarout.conference.service;

import java.util.*;

import com.qarout.conference.model.Registration;

public interface RegistrationService
{
    Registration addRegistration(Registration registration);

    List<Registration> findAll();
}
