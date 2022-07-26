package com.sxxblog112.controller;

import com.sxxblog112.entity.User;
import com.sxxblog112.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String index(){
        for (User user : userService.list()) {
            System.out.println(user.getUserName());
        }
        return "index";
    }
}
