package com.example.Course_Review;

import  java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CourseReviewApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(CourseReviewApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Course> courses = jdbcTemplate.query("SELECT * FROM Courses", (ResultSet, rowNum) -> new Course(ResultSet.getString(4), ResultSet.getString(1), ResultSet.getString(3), ResultSet.getString(5), ResultSet.getInt(2), ResultSet.getInt(6)));

	
	System.out.println("test");
	courses.forEach(System.out::println);
	}

}
