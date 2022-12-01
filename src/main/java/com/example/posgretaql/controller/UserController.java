package com.example.posgretaql.controller;

import com.example.posgretaql.model.UserModel;
import com.example.posgretaql.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {
    private UserService service;
    public UserController(
            UserService service
    ) {
        this.service = service;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String index(Model model) {
        List<UserModel> users = service.findAll();
        model.addAttribute("users", users);
        return "user/index";
    }
}