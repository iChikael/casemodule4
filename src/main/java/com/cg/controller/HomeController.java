package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping("/products")
    public String showHomePage() {
        return "temp";
    }

    @GetMapping("/add")
    public String showAddProduct(){
        return "addproduct";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/list")
    public String showAdminPage(){
        return "index";
    }
}
