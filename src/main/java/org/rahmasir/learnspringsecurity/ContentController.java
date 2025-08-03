package org.rahmasir.learnspringsecurity;

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
}
