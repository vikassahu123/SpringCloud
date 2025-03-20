package com.example.SpringUser_menu.UserMenu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class UserMenuController {
    @GetMapping("/list")
    public String getMenu() {
        return "User menu service is working";
    }
}
