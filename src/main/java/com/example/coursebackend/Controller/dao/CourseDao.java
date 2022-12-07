package com.example.coursebackend.Controller.dao;

import com.example.coursebackend.Model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {

    @Query(value ="SELECT `id`, `coursetitle`, `date`, `description`, `duration`, `venu` FROM `course` WHERE `coursetitle` LIKE %:coursetitle%",nativeQuery = true)
    List<Course> Search(@Param("coursetitle") String coursetitle);

}
