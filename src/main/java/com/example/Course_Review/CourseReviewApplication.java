package com.example.Course_Review;

import com.example.Course_Review.Course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

//when ran go to http://localhost:8080/api/v1/course to see the courses from the db

@SpringBootApplication
public class CourseReviewApplication{

	public static void main(String[] args) {
		SpringApplication.run(CourseReviewApplication.class, args);
	}

}
