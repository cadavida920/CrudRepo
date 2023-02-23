package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holamundo {


   @RequestMapping("/")
    public String Holamundo(){
        return "Hola mundo!";
    }
}
