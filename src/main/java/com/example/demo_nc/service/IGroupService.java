package com.example.demo_nc.service;

import com.example.demo_nc.model.Group;
import java.util.List;

public interface IGroupService {
    Group getGroupById(Integer id);
    Group save(Group group);
    void deleteById(Integer id);

    List<Group> getAllGroups();
    Group createGroup(Integer id, String name);
}
