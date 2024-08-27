package com.in28Minutes.springboot.learn_jpa;

import com.in28Minutes.springboot.learn_jpa.Models.Course;
import com.in28Minutes.springboot.learn_jpa.Repository.CourseDataJpaRepo;
import com.in28Minutes.springboot.learn_jpa.Repository.CourseJdbcRepo;
import com.in28Minutes.springboot.learn_jpa.Repository.CourseJpaRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestCommandLineRunner implements CommandLineRunner {

//    private CourseJdbcRepo repo;
//
//    public TestCommandLineRunner(CourseJdbcRepo repo) {
//        this.repo = repo;
//    }

//    private CourseJpaRepo repo;
//
//    public TestCommandLineRunner(CourseJpaRepo repo) {
//        this.repo = repo;
//    }

    private CourseDataJpaRepo repo;

    public TestCommandLineRunner(CourseDataJpaRepo repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Course(2,"java jpa", "Pramod"));
        repo.save(new Course(3,"spring jpa", "Pramod"));
        repo.save(new Course(4,"jpa", "not sure"));
        repo.save(new Course(5,"cloud", "Pramod"));

        //repo.deleteById(3);

        System.out.println(repo.findById(5));
        System.out.println(repo.findAll());

        System.out.println(repo.findById(5).orElse(null));

        System.out.println(repo.findByAuthor("Pramod"));
        System.out.println(repo.findByName("spring jpa"));
    }
}
