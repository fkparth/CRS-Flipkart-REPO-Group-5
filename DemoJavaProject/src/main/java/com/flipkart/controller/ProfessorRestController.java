package com.flipkart.controller;

import com.flipkart.bean.Professor;
import com.flipkart.dao.ProfessorDAO;
import com.flipkart.dao.ProfessorDAOoperation;
import com.flipkart.entity.ProfessorChooseCourseEntity;
import com.flipkart.entity.UserLoginEntity;
import com.flipkart.exceptions.CourseNotAssignedToProfException;
import com.flipkart.exceptions.GradeNotAddedException;
import com.flipkart.exceptions.NoStudentRegisteredException;

import javax.validation.Valid;
import javax.validation.Validator;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.ArrayList;

@Path("/professor")
public class ProfessorRestController {
    private final Validator validator;

    public  ProfessorRestController(Validator validator) {
        this.validator = validator;
    }
    @PUT
    @Path("/choose_course")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response chooseCourse(@Valid ProfessorChooseCourseEntity entity)  throws SQLException, CourseNotAssignedToProfException, NoStudentRegisteredException, GradeNotAddedException {
        ProfessorDAO PI = new ProfessorDAOoperation();
        ArrayList<String> res = PI.chooseCourse(entity.getUserId());
        return Response.status(200).entity("Something went !correct").build();
    }


}
