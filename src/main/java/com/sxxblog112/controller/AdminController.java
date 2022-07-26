package com.sxxblog112.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sxx112")
public class AdminController {

    @GetMapping("/")
    public String adminIndex(){
        return "/admin/index";
    }
}
