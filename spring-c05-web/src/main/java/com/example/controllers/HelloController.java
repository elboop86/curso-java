package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HelloController {

    @GetMapping("hola")
    public String metodo1() {
        return "hello";
    }

    @GetMapping("Bye")
    public String metodo2() {
        return "Bye";
    }
}
