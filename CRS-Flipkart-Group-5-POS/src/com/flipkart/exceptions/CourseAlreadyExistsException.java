package com.flipkart.exceptions;

<<<<<<< HEAD
public class CourseAlreadyExistsException extends Exception {
    /**
     * Message returned when exception is thrown
     */
    @Override
    public String getMessage() {
        return "Course already exists.";
=======
//Exception to check if the course already exists in catalogue  (used by admin)
public class CourseAlreadyExistsException extends Exception{
    private int courseId;

    //constructor
    public CourseAlreadyExistsException(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    @Override
    public String getMessage() {
        return "The course with ID: " + courseId + "already exists";
>>>>>>> bf746eebbe1e6ae29efe60faead0652e75e4d3d1
    }
}
