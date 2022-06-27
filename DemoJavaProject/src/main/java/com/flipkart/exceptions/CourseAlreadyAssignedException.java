package com.flipkart.exceptions;

public class CourseAlreadyAssignedException extends Exception{
        private int professorId;

        public CourseAlreadyAssignedException(int professorId) {
            this.professorId = professorId;
        }

        public int getProfessorId() {
            return professorId;
        }

        @Override
        public String getMessage() {
            return "Exception: Professor with ID: " + professorId + " has already been assigned a course";
        }
}
