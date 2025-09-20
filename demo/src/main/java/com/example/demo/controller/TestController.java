package com.example.demo.controller;

import com.example.demo.Entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Test controller.
 */
@RestController
public class TestController {

    /**
     * The User.
     */
    public final User user;

    /**
     * Instantiates a new Test controller.
     *
     * @param user the user
     */
    public TestController(User user) {
        this.user = user;
    }

    /**
     * Test string.
     *
     * @return the string
     */
    @RequestMapping("/test")
    public String test() {
        String name = user.getName();
        String phone = user.getPhone();
        String email = user.getEmail();
        System.out.println(user.toString());
        System.out.println("主干添加");
        return "test";
    }


}
