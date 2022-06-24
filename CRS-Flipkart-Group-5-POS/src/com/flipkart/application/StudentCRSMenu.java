package com.flipkart.application;

import com.flipkart.bean.Student;
import com.flipkart.dao.StudentDAO;
import com.flipkart.dao.StudentDAOoperation;

import com.flipkart.exceptions.*;

import java.sql.SQLException;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
public class StudentCRSMenu {

    public static void showChoices(Student student) throws SQLException, RegistrationUnsuccessfulException, NoRegisteredCoursesException, CourseNotAddedException, CourseNotDroppedException, PaymentUnsuccessfulException {

        if (student==null)
            return;
        Scanner sc = new Scanner(System.in);
        int choice =0;
        while (choice!=-1){
            StudentDAO si = new StudentDAOoperation();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
            LocalDateTime now = LocalDateTime.now();
            String dateTimeString = now.format(formatter);
            System.out.print(dateTimeString+", ");

            System.out.println("Hello "+student.getName());
            System.out.println("1. View Course Catalogue");
            System.out.println("2. Register");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Add Courses");
            System.out.println("5. Drop Courses");
            System.out.println("6. Fee Payment ");
            System.out.println("7. View Gradesheets");
            System.out.println("Press -1 to Logout");
            System.out.println("Enter Choice : ");

             choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //view course catalogue to choose course
                    si.viewCourseCatalogue();
                    break;
                case 2:
                    //to register a new student
                    si.register(student);
                    break;
                case 3:
                    //to view courses chosen by student
                    si.viewCourses(student.getUserId());
                    break;
                case 4:
                    //add courses according to preference
                    si.addCourses(student);
                    break;
                case 5:
                    //drop unwanted course
                    si.dropCourses(student);
                    break;
                case 6:
<<<<<<< HEAD
                    //fee payment for chosen courses
                    si.feePayment();
=======
                    si.feePayment(student);
>>>>>>> 9626dd773eb3a47e4251ec665111bd931c924ba4
                    break;
                case 7:
                    //view gradesheet after completion of course
                    si.viewGradesheet(student.getUserId());
                    break;
                case -1:
                    break;
                default:
                    System.out.println("Invalid Choice Entered");
            }

        }

    }

}
