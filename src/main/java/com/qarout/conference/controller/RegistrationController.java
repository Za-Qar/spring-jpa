package com.qarout.conference.controller;

import com.qarout.conference.model.Registration;
import com.qarout.conference.service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController
{
    @Autowired
    RegistrationService registrationService;

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute("registration") Registration registration) {
        registrationService.addRegistration(registration);
        System.out.println("Registration: " + registration.getName());
        return "redirect:registration";
    }
}
