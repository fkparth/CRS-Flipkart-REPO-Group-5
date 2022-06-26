package com.flipkart.controller;

import com.flipkart.application.*;
import com.flipkart.bean.*;
import com.flipkart.dao.*;
import com.flipkart.entity.*;
import com.flipkart.exceptions.*;
import com.flipkart.utils.*;
import com.flipkart.constants.*;

import java.sql.*;
import java.util.Scanner;

import java.net.URISyntaxException;
import java.sql.SQLException;

import javax.validation.Valid;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/admin")
public class AdminRestController {
    private final Validator validator;

    public AdminRestController(Validator validator) {
        this.validator = validator;
    }



    @PUT
    @Path("/updatecatalogue")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateCatalogue(@Valid AdminUpdateCatalogueEntity entity) throws URISyntaxException, UserNotFoundException, SQLException, NoRegisteredCoursesException, CourseNotAddedException, PaymentUnsuccessfulException, CourseNotDroppedException, RegistrationUnsuccessfulException, CourseNotFoundException,CourseAlreadyExistsException \ {
        // validation

        // call the dao
        int addOrDrop = entity.getAddOrDrop();
        int courseId = entity.getCourseId();
        String courseName = entity.getCourseName();
        AdminDAO admin = new AdminDAOoperation();
        admin.updateCatalogue(addOrDrop,courseId,courseName);

        return Response.status(200).entity("Course Add/Drop successful").build();
    }


}
