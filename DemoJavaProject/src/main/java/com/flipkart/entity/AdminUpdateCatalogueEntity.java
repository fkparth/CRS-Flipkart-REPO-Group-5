package com.flipkart.entity;

public class AdminUpdateCatalogueEntity {
    public int addOrDrop;
    public int courseId;
    public String courseName;

    public AdminUpdateCatalogueEntity() {
    }
    public AdminUpdateCatalogueEntity(int addOrDrop, int courseId,String courseName) {
        this.addOrDrop = addOrDrop;
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getAddOrDrop() {
        return addOrDrop;
    }

    public void setAddOrDrop(int addOrDrop) {
        this.addOrDrop = addOrDrop;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}