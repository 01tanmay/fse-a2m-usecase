package com.market.discoveryserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SwaggerController {

    @GetMapping("/yo")
    public String check() {
        return "Hi Swagger";
    }

    @PutMapping("/yo")
    public String checkit() {
        return "Hi from put";
    }
}
