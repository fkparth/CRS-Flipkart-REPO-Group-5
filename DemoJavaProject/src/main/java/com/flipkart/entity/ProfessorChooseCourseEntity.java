package com.flipkart.entity;

public class ProfessorChooseCourseEntity {
    public int userId;
    public String password;

    public ProfessorChooseCourseEntity(int userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public ProfessorChooseCourseEntity() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }
}
