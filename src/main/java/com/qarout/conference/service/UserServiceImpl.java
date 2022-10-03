package com.qarout.conference.service;

import javax.transaction.Transactional;

import com.qarout.conference.model.User;
import com.qarout.conference.respository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }
}
