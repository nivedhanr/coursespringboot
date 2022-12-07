package com.example.coursebackend.Controller;

import com.example.coursebackend.Controller.dao.CourseDao;
import com.example.coursebackend.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CourseController {
    @Autowired
    private CourseDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add" ,consumes = "application/json",produces = "application/json")
    public Map<String,String> Add(@RequestBody Course c){

        System.out.println(c.getCoursetitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getVenu().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getDate().toString());
        dao.save(c);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Course> View(){
        return (List<Course>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Course> Search(@RequestBody Course c){
        String coursetitle=c.getCoursetitle();
        System.out.println(coursetitle);
        return (List<Course>) dao.Search(c.getCoursetitle());
    }
}
