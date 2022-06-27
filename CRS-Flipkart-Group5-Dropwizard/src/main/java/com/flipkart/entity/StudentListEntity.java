package com.flipkart.entity;

public class StudentListEntity {
    public String studName;
    public int studId;

    public StudentListEntity() {
    }

    public StudentListEntity(String studName, int studId) {
        this.studName = studName;
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }
}
