package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloRootController {

    @GetMapping("/hello")
    public String hello(Model model) {
        return "hello";
    }

    @GetMapping("/helloRoot")
    public String helloRoot(Model model) {
        model.addAttribute("message", "こんにちは！管理者ユーザーさん、Spring Boot！");
        return "helloRoot"; // → helloRoot.html が表示される
    }
}