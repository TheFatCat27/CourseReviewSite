package com.example.Course_Review.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements CommandLineRunner {

    private List<Course> courses;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {

        List<Course> course = jdbcTemplate.query("SELECT * FROM Courses", (ResultSet, rowNum) -> new Course(ResultSet.getString(4), ResultSet.getString(1), ResultSet.getString(3), ResultSet.getString(5), ResultSet.getInt(2), ResultSet.getInt(6)));
        courses = course;

    }

    public List<Course> getCourses() {

        return courses;
    }
}
