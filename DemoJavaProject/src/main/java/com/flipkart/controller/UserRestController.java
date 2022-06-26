package com.flipkart.controller;

import com.flipkart.application.AdminCRSMenu;
import com.flipkart.application.ProfessorCRSMenu;
import com.flipkart.application.StudentCRSMenu;
import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.dao.*;
import com.flipkart.entity.UserLoginEntity;
import com.flipkart.entity.UserRegisterEntity;
import com.flipkart.exceptions.*;

import java.net.URISyntaxException;
import java.sql.SQLException;

import javax.validation.Valid;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserRestController {
    private final Validator validator;

    public UserRestController(Validator validator) {
        this.validator = validator;
    }

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(@Valid UserLoginEntity entity) throws URISyntaxException, UserNotFoundException, SQLException, NoRegisteredCoursesException, CourseNotAddedException, PaymentUnsuccessfulException, CourseNotDroppedException, RegistrationUnsuccessfulException, CourseNotFoundException {
        // validation

        // call the dao
        int userName = entity.getUserId();
        String password = entity.getPassword();

        int reqRole = userName / 100;
        if (reqRole == 1) {

            StudentDAO SI = new StudentDAOoperation();
            Student s = SI.fetchStudentData((userName));

            return Response.status(200).entity("StudentId: "+s.getUserId() + ", StudentName: " + s.getName()).build();
//            return Response.status(200).entity(s).build();

        } else if (reqRole == 2) {
            ProfessorDAO PI = new ProfessorDAOoperation();
            Professor p = PI.fetchProfessorData(userName);
            return Response.status(200).entity("ProfessorId: "+p.getUserId() + ", ProfessorName: " + p.getName()).build();
//            return Response.status(200).entity(p).build();

        } else if (reqRole == 3) {
            AdminDAO AI = new AdminDAOoperation();
            Admin ad = AI.fetchAdminData(userName);
            return Response.status(200).entity("AdminId: "+ad.getUserId() + ", AdminName: " + ad.getName()).build();
//            return Response.status(200).entity(ad).build();
        }

        return Response.status(200).entity("Something went !correct").build();
    }

    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response register(@Valid UserRegisterEntity entity) throws URISyntaxException {
        // validation
        return Response.status(200).entity(entity.getName()).build();
    }

    @POST
    @Path("/register2")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response register2(@NotNull @QueryParam("name") String name, @NotNull @QueryParam("password") String password) throws URISyntaxException {
        // validation
        return Response.status(200).entity(name).build();
    }


}