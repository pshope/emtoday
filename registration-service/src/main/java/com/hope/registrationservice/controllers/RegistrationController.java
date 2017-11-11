package com.hope.registrationservice.controllers;

import com.hope.registrationservice.models.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String viewRegister(UserModel userModel) {
        return "RegistrationForm";
    }
}
