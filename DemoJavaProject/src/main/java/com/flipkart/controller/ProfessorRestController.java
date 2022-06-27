package com.flipkart.controller;

import com.flipkart.dao.ProfessorDAO;
import com.flipkart.dao.ProfessorDAOoperation;
import com.flipkart.dao.StudentDAO;
import com.flipkart.dao.StudentDAOoperation;
<<<<<<< HEAD
import com.flipkart.entity.*;
import com.flipkart.exceptions.CourseNotAssignedToProfException;
import com.flipkart.exceptions.GradeNotAddedException;
import com.flipkart.exceptions.NoStudentRegisteredException;
=======
import com.flipkart.entity.CourseCatalogEntity;
import com.flipkart.exceptions.*;
>>>>>>> 756eb04ad6c81c7792286df0e2dd952c95daf0b7

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

<<<<<<< HEAD
    @POST
    @Path("/choose_course")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response chooseCourse(@Valid ProfessorChooseCourseEntity entity)  throws SQLException, CourseNotAssignedToProfException, NoStudentRegisteredException, GradeNotAddedException {
        ProfessorDAO PI = new ProfessorDAOoperation();
        GenericResponse res=PI.chooseCourse(entity.getUserId(), entity.getCourseId());

        return Response.status(200).entity(res).build();
    }


    @GET
    @Path("/view_student_list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewStudentList(@Valid ProfessorChooseCourseEntity entity)  throws SQLException, CourseNotAssignedToProfException, NoStudentRegisteredException, GradeNotAddedException {
        ProfessorDAO PI = new ProfessorDAOoperation();
        ArrayList<StudentListEntity> res = PI.viewStudentsList(entity.getUserId());
        for(int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i).getStudId() + " -> ash");
        }
        return Response.status(200).entity(res).build();
    }

    @POST
    @Path("/assign_grade")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response assignGrade(@Valid ProfessorChooseCourseEntity entity)  throws SQLException, CourseNotAssignedToProfException, NoStudentRegisteredException, GradeNotAddedException {
        ProfessorDAO PI = new ProfessorDAOoperation();
        GenericResponse res=PI.assignGrade(entity.getUserId(), entity.getGrade());

        return Response.status(200).entity(res).build();
    }
=======
>>>>>>> 756eb04ad6c81c7792286df0e2dd952c95daf0b7


}
