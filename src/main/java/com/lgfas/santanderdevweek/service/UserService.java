package com.lgfas.santanderdevweek.service;

import com.lgfas.santanderdevweek.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
