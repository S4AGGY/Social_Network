package com.example.demo_nc.service;


import com.example.demo_nc.model.Group;
import com.example.demo_nc.repo.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class GroupService implements IGroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Group getGroupById(Integer id) {
        return groupRepository.findGroupById(id);
    }

    @Override
    public Group save(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public void deleteById(Integer id) {
        groupRepository.deleteById(id);
    }

    @Override
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    @Override
    public Group createGroup(Integer id, String name) {
        Group group = new Group();
        group.setName(name);
        group.setId(id);
        return groupRepository.save(group);
    }
}
