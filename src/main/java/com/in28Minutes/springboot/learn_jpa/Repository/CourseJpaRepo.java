package com.in28Minutes.springboot.learn_jpa.Repository;

import com.in28Minutes.springboot.learn_jpa.Models.Course;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepo{

    private EntityManager entityManager;

    public CourseJpaRepo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insertCourse(Course course){
        entityManager.merge(course);
    }

    public void deleteCourse(Integer id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

    public Course findCourseById(Integer id){
        return entityManager.find(Course.class, id);
    }
}
