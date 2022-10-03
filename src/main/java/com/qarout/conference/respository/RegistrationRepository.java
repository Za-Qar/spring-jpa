package com.qarout.conference.respository;

import java.util.*;

import com.qarout.conference.model.Registration;
import com.qarout.conference.model.RegistrationReport;

public interface RegistrationRepository
{
    Registration addRegistration(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();
}
