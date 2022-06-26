package com.flipkart.controller;

import com.flipkart.dao.ProfessorDAO;
import com.flipkart.dao.ProfessorDAOoperation;
import com.flipkart.dao.StudentDAO;
import com.flipkart.dao.StudentDAOoperation;
import com.flipkart.entity.CourseCatalogEntity;
import com.flipkart.exceptions.*;

import javax.validation.Valid;
import javax.validation.Validator;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;

@Path("/professor")
public class ProfessorRestController {
    private final Validator validator;

    public  ProfessorRestController(Validator validator) {
        this.validator = validator;
    }

    @GET
    @Path("/view_course_calalog")
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewCourseCatalog() throws SQLException, CourseNotAssignedToProfException, NoStudentRegisteredException, GradeNotAddedException, UserNotFoundException, NoRegisteredCoursesException, CourseNotAddedException, CourseAlreadyExistsException, PaymentUnsuccessfulException, CourseNotDroppedException, RegistrationUnsuccessfulException, CourseNotFoundException, URISyntaxException {
        StudentDAO SI = new StudentDAOoperation();
        ArrayList<CourseCatalogEntity> res = SI.viewCourseCatalogue();
        for(int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i).getCourseId() + " -> ash");
        }
        return Response.status(200).entity(res).build();
    }



}
