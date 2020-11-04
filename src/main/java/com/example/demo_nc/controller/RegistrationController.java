package com.example.demo_nc.controller;

import com.example.demo_nc.model.User;
import com.example.demo_nc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.management.remote.JMXAuthenticator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Objects;
import java.util.Optional;


@Controller
public class RegistrationController {

    @Autowired
    private IUserService userService;

    @GetMapping("/registration")
    public String getRegistration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }


    @PostMapping("/registration")
    public String addUser(@ModelAttribute("userForm") @Valid User userForm, BindingResult bindingResult, Model model) {
        System.out.println(bindingResult.toString());
        if (bindingResult.hasErrors()) {
            System.out.println("return1");
            return "registration";
        }
        if (!userService.saveUser(userForm)){
            System.out.println("return2");
            model.addAttribute("usernameError", "Пользователь с таким именем уже существует");
            return "registration";
        }

        return "redirect:/login";
    }
}
