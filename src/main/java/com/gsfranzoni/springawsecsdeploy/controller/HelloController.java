package com.gsfranzoni.springawsecsdeploy.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {

    private record HelloResponse(String message) {}

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HelloResponse> hello(@RequestParam(required = false, defaultValue = "World") String name) {
        HelloResponse response = new HelloResponse("Hello, " + name + "!");
        return ResponseEntity.ok(response);
    }
}
