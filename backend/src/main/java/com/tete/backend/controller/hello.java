package com.tete.backend.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class hello {
    

    @GetMapping("/")
    public String hello(){
        return "OLAAAAAAAA";
    
    }
}
