package com.lijin.webpagegeneratorservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/webpagegen")
public class WebPageGenController {
    @GetMapping(value = "/test")
    public String test(){
        return "this is web page gen service controller";
    }
}
