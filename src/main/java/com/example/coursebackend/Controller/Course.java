package com.example.coursebackend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Course {
    @PostMapping("/add")
    public String Add(){
        return "added successfully";
    }
    @GetMapping("/view")
    public String View(){
        return "view course";
    }
}
