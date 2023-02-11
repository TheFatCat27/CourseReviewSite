package com.example.Course_Review.Course;


public class Course {
    private String title;
    private String degree;
    private String code;
    private String description;
    private Integer id;
    private Integer points;



    public Course(String title, String degree, String code, String description, Integer id, Integer points) {
        this.title = title;
        this.degree = degree;
        this.code = code;
        this.description = description;
        this.id = id;
        this.points = points;
    }
    public  String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public int getPoints(){
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }


    @Override
    public String toString() {
        return String.format("Course [title= %s, degree= %s, code= %s, description=%s, id = %d, points= %d", title, degree, code, description, id, points);
    }
}