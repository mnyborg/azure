package com.example.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class Controller {
    @GetMapping("/welcome")
    public String Welcome() {
        return "Velkommen til et fantastisk team med 3 medlemmer";

    }
}
