package com.example.demo0406;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {


    @GetMapping("/hello")
    public String hello(){
        return "hello AGAIN!!!";
    }
}
