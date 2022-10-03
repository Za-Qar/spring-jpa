package com.qarout.conference.service;

import java.util.*;

import com.qarout.conference.model.Registration;
import com.qarout.conference.model.RegistrationReport;

public interface RegistrationService
{
    Registration addRegistration(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();
}
