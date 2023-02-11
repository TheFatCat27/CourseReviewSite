package com.example.Course_Review.Review;

import java.util.Date;

public class Review {
    private Integer id;
    private String content;
    private Integer user_id;
    private Integer course_id;
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public Integer getUserId(){
        return user_id;
    }

    public void setUserId(Integer userId){
        this.user_id = userId;
    }

    public Integer getCourseId(){
        return course_id;
    }

    public void setCourseId(Integer courseId){
        this.course_id = courseId;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

}
