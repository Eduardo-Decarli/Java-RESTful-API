package com.decarli.api_cloud_deploy.domain.services;

import com.decarli.api_cloud_deploy.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User user);
}
