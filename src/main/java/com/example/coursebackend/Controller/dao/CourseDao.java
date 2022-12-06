package com.example.coursebackend.Controller.dao;

import com.example.coursebackend.Model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {


}
