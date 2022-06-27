package com.flipkart.entity;

public class ProfessorChooseCourseEntity {
    public int userId;
    public int courseId;
    public int studId;
    public String grade;

    public ProfessorChooseCourseEntity() {
    }

    public ProfessorChooseCourseEntity(int userId, int courseId, int studId, String grade) {
        this.userId = userId;
        this.courseId = courseId;
        this.studId = studId;
        this.grade = grade;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }




}
