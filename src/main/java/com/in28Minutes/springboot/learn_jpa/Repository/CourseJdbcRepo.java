package com.in28Minutes.springboot.learn_jpa.Repository;

import com.in28Minutes.springboot.learn_jpa.Models.Course;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepo {

    private JdbcTemplate jdbcTemplate;

    private static String insert_query = "insert into course values(?, ?, ?)";

    private static String delete_query = "delete from course where id = ?";

    private static String select_query = "select *  from course where id = ?";

    public CourseJdbcRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertCourse(Course course){
        jdbcTemplate.update(CourseJdbcRepo.insert_query, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteCourse(Integer id){
        jdbcTemplate.update(CourseJdbcRepo.delete_query, id);
    }

    public Course findCourseById(Integer id){
        return jdbcTemplate.queryForObject(CourseJdbcRepo.select_query,new BeanPropertyRowMapper<>(Course.class), id);
    }
}
