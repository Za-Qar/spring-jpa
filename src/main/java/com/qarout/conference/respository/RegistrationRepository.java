package com.qarout.conference.respository;

import java.util.*;

import com.qarout.conference.model.Registration;

public interface RegistrationRepository
{
    Registration addRegistration(Registration registration);

    List<Registration> findAll();
}
