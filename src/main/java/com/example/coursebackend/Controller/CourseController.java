package com.example.coursebackend.Controller;

import com.example.coursebackend.Controller.dao.CourseDao;
import com.example.coursebackend.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseDao dao;
    @PostMapping(path = "/add" ,consumes = "application/json",produces = "application/json")
    public String Add(@RequestBody Course c){

        System.out.println(c.getCoursetitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getVenu().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getDate().toString());
        dao.save(c);
        return "added successfully";

    }
    @GetMapping("/view")
    public List<Course> View(){
        return (List<Course>) dao.findAll();
    }
}
