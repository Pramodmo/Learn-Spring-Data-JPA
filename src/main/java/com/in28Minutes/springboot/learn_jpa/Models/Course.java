package com.in28Minutes.springboot.learn_jpa.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "course")
public class Course {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name= "name")
    private String name;

    @Column(name= "author")
    private String author;

    public Course() {
    }

    public Course(Integer id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
