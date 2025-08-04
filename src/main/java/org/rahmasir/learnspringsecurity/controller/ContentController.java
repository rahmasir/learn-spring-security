package org.rahmasir.learnspringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/home")
    public String handleWelcome() {
        return "home";
    }

    @GetMapping("/user/home")
    public String handleUserHome() {
        return "user_home";
    }

    @GetMapping("/admin/home")
    public String handleAdminHome() {
        return "admin_home";
    }

    @GetMapping("")
    public String handleIndexPage() {
        return "index";
    }

    @GetMapping("/login")
    public String handleLogin() {
        return "custom_login";
    }
}
