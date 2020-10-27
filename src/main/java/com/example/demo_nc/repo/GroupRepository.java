package com.example.demo_nc.repo;

import com.example.demo_nc.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository  extends JpaRepository<Group, Integer> {
    Group findGroupById(Integer id);
}
