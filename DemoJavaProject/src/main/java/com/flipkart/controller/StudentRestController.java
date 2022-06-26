package com.flipkart.controller;

import com.flipkart.application.AdminCRSMenu;
import com.flipkart.application.ProfessorCRSMenu;
import com.flipkart.application.StudentCRSMenu;
import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.dao.*;
import com.flipkart.entity.*;
import com.flipkart.exceptions.*;
import com.flipkart.utils.*;
import com.flipkart.constants.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import java.net.URISyntaxException;
import java.sql.SQLException;

import javax.validation.Valid;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/student")
public class StudentRestController {
    private final Validator validator;

    public StudentRestController(Validator validator) {
        this.validator = validator;
    }


    @PUT
    @Path("/addcourse")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addCourse(@Valid StudentAddCourseEntity entity) throws  SQLException, CourseNotAddedException {
        // validation and dao
        try {
            int stdid = entity.getStdid();
            int courseid = entity.getCourseid();
            StudentDAO stud = new StudentDAOoperation();
            stud.addCourses(stdid, courseid);
            return Response.status(200).entity("Course Added").build();
        } catch (SQLException se) {
            return Response.status(500).entity(se.getMessage()).build();
//            throw new CourseNotDroppedException();
        }
    }

    @DELETE
    @Path("/dropcourse")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response dropCourses(@Valid StudentAddCourseEntity entity) throws SQLException, CourseNotDroppedException,CourseNotFoundException {
        // validation and dao
        try {
            int stdid = entity.getStdid();
            int courseid = entity.getCourseid();
            StudentDAO stud = new StudentDAOoperation();
            stud.dropCourses(stdid, courseid);
            return Response.status(201).entity("Course Dropped").build();
        } catch (Exception e) {
            return Response.status(500).entity(e.getMessage()).build();
//            throw new CourseNotDroppedException();
        }
    }
}
