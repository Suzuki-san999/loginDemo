package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "redirect:/home"; // index.htmlを表示
    }

    @GetMapping("/home")
    public String toindex() {
        return "index"; // index.htmlを表示
    }
   /*public String healthCheck() {
        return "OK";
    }*/
}
