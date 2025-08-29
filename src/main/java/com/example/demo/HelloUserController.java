package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloUserController {

    @GetMapping("/helloUser")
    public String hello(Model model) {
        model.addAttribute("message", "こんにちは！一般ユーザーさん、Spring Boot！");
        return "helloUser"; // → helloUser.html が表示される
    }
}