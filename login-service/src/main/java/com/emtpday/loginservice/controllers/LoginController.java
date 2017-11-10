package com.emtpday.loginservice.controllers;

import com.emtpday.loginservice.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

@Controller
public class LoginController extends WebMvcConfigurerAdapter {



    @GetMapping("/login")
    public String viewLogin(User model) {
        return "LoginForm";
    }

    @PostMapping("/login")
    public String doLogin(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "LoginForm";
        }

        return "LoginSuccess";
    }
}
