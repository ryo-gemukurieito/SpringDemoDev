package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping; // これを追加
import org.springframework.web.bind.annotation.RequestParam; // これが必要
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello, Spring Boot!");
        return "home"; // home.htmlを返す
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name", defaultValue = "Guest") String name, Model model) {
        model.addAttribute("message", "Hello, " + name + "!");
        return "home"; // home.htmlを返す
    }
    @PostMapping("/submit")
    public String submit(@RequestParam("name") String name, Model model) {
        model.addAttribute("message", "Submitted name: " + name);
        return "home";
    }

}
