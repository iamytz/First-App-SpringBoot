package com.colonia.gabriel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrollController {
    @GetMapping("/67")
    public String jean() {
        return "jean";
    }
}
