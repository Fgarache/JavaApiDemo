package com.example.JavaApiDemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usuarioControllers {
@RequestMapping(value = "prueva")
    public String prueva(){
        return "prueva";
    }
}
