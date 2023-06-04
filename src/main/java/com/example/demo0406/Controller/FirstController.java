package com.example.demo0406.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


    @GetMapping("/hello")
    public String hello(){
        return "hello there.version 2";
    }
}
