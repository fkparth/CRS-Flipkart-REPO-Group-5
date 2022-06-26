package com.flipkart.controller;

import com.flipkart.bean.Professor;
import com.flipkart.dao.ProfessorDAO;
import com.flipkart.dao.ProfessorDAOoperation;
import com.flipkart.dao.StudentDAO;
import com.flipkart.dao.StudentDAOoperation;
import com.flipkart.entity.CourseCatalogEntity;
import com.flipkart.entity.ProfessorChooseCourseEntity;
import com.flipkart.entity.UserLoginEntity;
import com.flipkart.exceptions.CourseNotAssignedToProfException;
import com.flipkart.exceptions.GradeNotAddedException;
import com.flipkart.exceptions.NoStudentRegisteredException;

import javax.validation.Valid;
import javax.validation.Validator;
import javax.ws.rs.*;
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

    @GET
    @Path("/view_course_calalog")
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewCourseCatalog()  throws SQLException, CourseNotAssignedToProfException, NoStudentRegisteredException, GradeNotAddedException {
        StudentDAO SI = new StudentDAOoperation();
        ArrayList<CourseCatalogEntity> res = SI.viewCourseCatalogue();
        for(int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i).getCourseId() + " -> ash");
        }
        return Response.status(200).entity(res).build();
    }

    @POST
    @Path("/choose_course")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response chooseCourse(@Valid ProfessorChooseCourseEntity entity, @Valid CourseCatalogEntity en)  throws SQLException, CourseNotAssignedToProfException, NoStudentRegisteredException, GradeNotAddedException {
        ProfessorDAO PI = new ProfessorDAOoperation();
        boolean res=PI.chooseCourse(entity.getUserId(),en.getCourseId());
        return Response.status(200).entity(res).build();
    }


}
