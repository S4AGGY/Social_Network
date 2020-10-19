package com.example.demo_nc.service;

import com.example.demo_nc.CustomErrors;
import com.example.demo_nc.CustomException;
import com.example.demo_nc.model.User;
import com.example.demo_nc.model.UsernameAndPassword;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
public interface IDBExample {
    List<User> getCreatedUsers();
    void setCreatedUsers(List<User> createdUsers);
    User createUser(User user) throws CustomException;
}
