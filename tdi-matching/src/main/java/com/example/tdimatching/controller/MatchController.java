package com.example.tdimatching.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api/match")
public class MatchController {
    @GetMapping("/")
    private String getText(){
        return "test";
    }
}
