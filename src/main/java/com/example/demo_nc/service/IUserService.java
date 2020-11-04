package com.example.demo_nc.service;

import com.example.demo_nc.model.User;

import java.util.List;

public interface IUserService {
    User getUserById(Integer id);
    User save(User user);
    boolean saveUser(User user);
    boolean deleteUser(Integer id);
    void deleteById(Integer id);

    List<User> getAllUsers();
    User createUser(Integer id, String name);
}
