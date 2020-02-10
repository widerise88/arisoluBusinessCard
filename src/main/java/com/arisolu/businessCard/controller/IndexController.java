package com.arisolu.businessCard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
    @RequestMapping(value = "/main")
    public String index(){
        return "Index";
    }

    @RequestMapping(value = "/loginForm")
    public String loginForm(){
        return "member/login";
    }
}
