package com.decarli.api_cloud_deploy.domain.services.impl;

import com.decarli.api_cloud_deploy.domain.model.User;
import com.decarli.api_cloud_deploy.domain.repository.UserRepository;
import com.decarli.api_cloud_deploy.domain.services.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists!");
        }
        return userRepository.save(user);
    }
}
