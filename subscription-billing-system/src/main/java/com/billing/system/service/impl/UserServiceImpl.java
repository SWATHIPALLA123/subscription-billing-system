package com.billing.system.service.impl;

import com.billing.system.entity.User;
import com.billing.system.repository.UserRepository;
import com.billing.system.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl
        implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {

        return userRepository.findById(id)
                .orElse(null);
    }

    @Override
    public User updateUser(Long id, User user) {

        user.setId(id);

        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {

        userRepository.deleteById(id);
    }
}