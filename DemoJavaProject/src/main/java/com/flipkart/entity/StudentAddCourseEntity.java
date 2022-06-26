package com.flipkart.entity;

public class StudentAddCourseEntity {
        public int stdid;
        public int courseid;


        public StudentAddCourseEntity() {
        }
        public StudentAddCourseEntity(int stdid, int courseid) {
            this.stdid = stdid;
            this.courseid = courseid;

        }

    public int getStdid() {
        return stdid;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }
}
