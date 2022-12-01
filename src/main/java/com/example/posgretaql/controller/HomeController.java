package com.example.posgretaql.controller;

import com.example.posgretaql.model.MUserModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
@Slf4j
public class HomeController {
    @GetMapping("/home")
    public String getHome(Model model, @AuthenticationPrincipal MUserModel user) {
        log.info("HomeController start");
        log.info(user.toString());
        log.info("HomeController End");
        return "home/home";
    }

    @GetMapping("/home2")
    public String getHome2(Model model, Principal principal) {
        log.info("HomeController start");
        Authentication authentication = (Authentication) principal;
        MUserModel user1 = (MUserModel) authentication.getPrincipal();
        log.info("user1 : " + user1.toString());

        MUserModel user2 = (MUserModel) SecurityContextHolder
                .getContext().getAuthentication().getPrincipal();

        log.info("user2 : " + user2.toString());
        log.info("HomeController End");
        return "home/home";
    }


}
