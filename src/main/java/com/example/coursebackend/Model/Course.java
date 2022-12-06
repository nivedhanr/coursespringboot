package com.example.coursebackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
    @Id
    @GeneratedValue
    private int id;
    private String coursetitle;
    private String description;
    private String venu;
    private String duration;
    private String date;

    public Course() {
    }

    public Course(int id, String coursetitle, String description, String venu, String duration, String date) {
        this.id = id;
        this.coursetitle = coursetitle;
        this.description = description;
        this.venu = venu;
        this.duration = duration;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursetitle() {
        return coursetitle;
    }

    public void setCoursetitle(String coursetitle) {
        this.coursetitle = coursetitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVenu() {
        return venu;
    }

    public void setVenu(String venu) {
        this.venu = venu;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
