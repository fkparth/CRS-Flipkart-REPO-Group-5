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
    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response register(@Valid StudentRegisterCourseEntity entity) throws URISyntaxException, UserNotFoundException, SQLException, NoRegisteredCoursesException, CourseNotAddedException, PaymentUnsuccessfulException, CourseNotDroppedException, RegistrationUnsuccessfulException, CourseNotFoundException,CourseAlreadyExistsException  {
        // validation

        // call the dao
       int stud= entity.getStud();
        ArrayList<Integer> preference=entity.getPreference();
        StudentDAO student = new StudentDAOoperation();
        student.register(stud,preference);

        return Response.status(200).entity("Course Registeration Succesful").build();
    }


    @GET
    @Path("/viewgradesheet")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewGradesheet(@Valid StudentIdEntity entity) throws URISyntaxException, UserNotFoundException, SQLException, NoRegisteredCoursesException, CourseNotAddedException, PaymentUnsuccessfulException, CourseNotDroppedException, RegistrationUnsuccessfulException, CourseNotFoundException,CourseAlreadyExistsException  {
        // validation

        // call the dao
        int id=entity.getId();
        StudentDAO student = new StudentDAOoperation();
        ArrayList<StudentViewGradesheetEntity> grades=student.viewGradesheet(id);


        return Response.ok(grades,MediaType.APPLICATION_JSON).build();
    }
    @POST
    @Path("/payment")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response payment(@Valid StudentPaymentEntity entity) throws URISyntaxException, UserNotFoundException, SQLException, NoRegisteredCoursesException, CourseNotAddedException, PaymentUnsuccessfulException, CourseNotDroppedException, RegistrationUnsuccessfulException, CourseNotFoundException,CourseAlreadyExistsException  {
        // validation

        // call the dao
        int id=entity.getId();
        int paymentMode= entity.getPaymentMode();
        StudentDAO student = new StudentDAOoperation();
        student.feePayment(id,paymentMode);

        return Response.status(200).entity("PAYMENT DONE").build();
    }
    @GET
    @Path("/viewcoursecatalogue")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewCourseCatalogue(@Valid CourseCatalogEntity entity) throws URISyntaxException, UserNotFoundException, SQLException, NoRegisteredCoursesException, CourseNotAddedException, PaymentUnsuccessfulException, CourseNotDroppedException, RegistrationUnsuccessfulException, CourseNotFoundException,CourseAlreadyExistsException  {
        // validation

        // call the dao
        StudentDAO student = new StudentDAOoperation();
        ArrayList<CourseCatalogEntity> courses =student.viewCourseCatalogue();

        return Response.ok(courses,MediaType.APPLICATION_JSON).build();
    }
}
