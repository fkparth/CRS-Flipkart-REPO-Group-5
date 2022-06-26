package com.flipkart.entity;

public class AdminApproveStudentEntity {


    public int studentId;


    public AdminApproveStudentEntity() {
    }
    public AdminApproveStudentEntity(int studentId) {
        this.studentId = studentId;

    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}