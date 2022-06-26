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


public class StudentRestController {
    private final Validator validator;

    public StudentRestController(Validator validator) {
        this.validator = validator;
    }



}
