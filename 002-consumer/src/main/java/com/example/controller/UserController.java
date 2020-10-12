package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService u;
    @Autowired
    private UserService u2;

    @RequestMapping(value = "/user.do")
    String getUser (Model m,Integer id) {
        User u = this.u.queryUser(id);
        m.addAttribute("user",u);
        return "User";
    }

    @RequestMapping(value = "/user2.do")
    String getUser2 (Model m,Integer id) {
        User u = this.u2.queryUser(id);
        m.addAttribute("user",u);
        return "User";
    }

}
