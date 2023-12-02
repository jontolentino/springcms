package com.springcms.springcms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {
    @GetMapping("/temp")
    public String getExample() {
        return "Hello, this is the response for GET request";
    }

}
