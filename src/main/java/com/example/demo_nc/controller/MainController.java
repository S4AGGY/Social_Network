package com.example.demo_nc.controller;

import com.example.demo_nc.model.Group;
import com.example.demo_nc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    private List<User> users = new ArrayList<>();
    private List<Group> groups = new ArrayList<Group>();

    @GetMapping("/hello/text")
    @ResponseBody
    public String getHelloAsString() {
        return "hello wo";
    }

    @GetMapping("/hello")
    public String getHelloAsString2() {
        return "hello";
    }

    /*@GetMapping("/create/user/{id}/{name}")
    @ResponseBody
    public String createUser(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        users.add(user);
        return user.toString();
    }

    @GetMapping("/create/user")
    @ResponseBody
    public String createUser2(@RequestParam("id") Integer id, @RequestParam("name") String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        users.add(user);
        return user.toString();
    }*/

    @PostMapping("/create/user")
    @ResponseBody
    public String createUser(@RequestBody User user) {
        users.add(user);
        return user.toString();
    }

    @PostMapping("/create/group")
    @ResponseBody
    public String createUGroup(@RequestBody Group group) {
        groups.add(group);
        return group.toString();
    }

    @GetMapping("/groups")
    @ResponseBody
    public String getAllGroups() {
        return groups.toString();
    }

    @GetMapping("/users")
    @ResponseBody
    public String getAllUsers() {
        return users.toString();
    }

    @GetMapping("/user/count")
    @ResponseBody
    public String countUsers() {
        return String.valueOf(users.size());
    }

    @GetMapping("/group/count")
    @ResponseBody
    public String countGroups() {
        return String.valueOf(groups.size());
    }
}
