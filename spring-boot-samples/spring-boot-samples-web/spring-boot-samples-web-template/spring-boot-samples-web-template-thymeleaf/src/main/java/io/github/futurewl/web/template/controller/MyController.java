package io.github.futurewl.web.template.controller;

import io.github.futurewl.web.template.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @RequestMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", queryUsers());
        return "user";
    }

    private List<User> queryUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("admin","123456"));
        users.add(new User("user","123456"));
        return users;
    }

}
