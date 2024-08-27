package com.in28Minutes.springboot.learn_jpa.Repository;

import com.in28Minutes.springboot.learn_jpa.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDataJpaRepo extends JpaRepository<Course, Integer> {

    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);

}
