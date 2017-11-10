package springboottry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springboottry.models.User;

import javax.validation.Valid;

@Controller
public class LoginController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("templates/LoginSuccess");
    }

    @GetMapping("/login")
    public String viewLogin(Model model) {
        model.addAttribute("user", new User());
        return "LoginForm";
    }

    @PostMapping("/login")
    public String doLogin(@Valid @ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "LoginForm";
        }

        return "LoginSuccess";
    }
}
