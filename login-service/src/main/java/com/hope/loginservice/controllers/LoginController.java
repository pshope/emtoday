package com.hope.loginservice.controllers;


import com.hope.loginservice.models.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String viewLogin(UserModel model) {
        return "LoginForm";
    }

    @PostMapping("/login")
    public String doLogin(@Valid UserModel userModel, BindingResult result) {
        if (result.hasErrors()) {
            return "LoginForm";
        }

        return "LoginSuccess";
    }

}
