package io.github.futurewl.data.mybatis.web.controller;

import io.github.futurewl.data.mybatis.system.domain.User;
import io.github.futurewl.data.mybatis.system.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findUserById")
    public void findUserById(Long id) {
        User user1 = userService.findById(id);
        User user2 = userService.findById2(id);
        System.out.println(user1);
        System.out.println(user2);
    }
}
