package com.example.demo_nc.service;

import com.example.demo_nc.CustomErrors;
import com.example.demo_nc.CustomException;
import com.example.demo_nc.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class DBExample implements IDBExample {
    private List<User> createdUsers = new ArrayList<>();
    @Override
    public List<User> getCreatedUsers() {
        return createdUsers;
    }
    @Override
    public void setCreatedUsers(List<User> createdUsers) {
        this.createdUsers = createdUsers;
    }
    @Override
    public User createUser(User user) throws CustomException {
        if (this.createdUsers.stream()
                .filter(u -> u.getName().equals(user.getName()))
                .findFirst()
                .orElse(null) == null) {
            user.setId(getId());
            createdUsers.add(user);
            return user;
        }
        else {
            throw CustomErrors.USER_WITH_SUCH_USERNAME_FOUND.getException();
        }
    }

    private Integer getId() {
        return this.createdUsers.size() + 1;
    }
}