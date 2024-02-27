package br.com.lhf.userapi.services;

import br.com.lhf.userapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
